package com.bru.controller;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bru.dao.CarDao;
import com.bru.dao.CustomerDao;
import com.bru.dao.UserAllDao;
import com.bru.dao.UsertableDao;
import com.bru.model.BrandBean;
import com.bru.model.CarBean;

import com.bru.model.CriteriaBean;
import com.bru.model.MoneyBean;
import com.bru.model.UserAllBean;
import com.bru.model.YearBean;


@RestController
public class CarController {
	@Autowired
	UserAllDao userAllDao;
	@Autowired
	CustomerDao customerDao;
	@Autowired
	CarDao carDao;
	@Autowired
	UsertableDao usertableDao;
	
	@RequestMapping(value="/year")
	public List<YearBean> xxx() throws SQLException{
		List<YearBean> list = new ArrayList<YearBean>();
	
		list =carDao.findAll();
		return list;
	}
	
	@RequestMapping(value="/brand", method = RequestMethod.POST)
	public List<CarBean> brand(@RequestBody CriteriaBean criteriaBean) throws SQLException{
		
		List<CarBean> list = new ArrayList<>();
		
//		query master data
	/*	for(int i=0; i<10; i++) {
			bean = new BrandBean();
			bean.setCarId(i);
			bean.setCarName("Top"+i);
			
			list.add(bean);
		}
		
		*/
		list  = carDao.findAll(criteriaBean.getYear());
		return list;
	}
	
	@RequestMapping(value="/carmodel", method = RequestMethod.POST)
	public List<BrandBean> carmodel(@RequestBody CriteriaBean criteriaBean) throws SQLException{
		
		List<BrandBean> list = new ArrayList<>();
		
//		query master data
	/*	for(int i=0; i<10; i++) {
			bean = new BrandBean();
			bean.setCarId(i);
			bean.setCarName("Top"+i);
			
			list.add(bean);
		}
		
		*/
		list  = carDao.findAll(criteriaBean.getYear(), criteriaBean.getBrand());
		return list;
	}
	
	@RequestMapping(value="/gansel", method = RequestMethod.POST)
	public MoneyBean gansel(@RequestBody CriteriaBean criteriaBean) throws SQLException{
		MoneyBean bean = new MoneyBean();
		
		bean = usertableDao.gansel(criteriaBean.getYear());
	
		return bean;
	}
	
	@RequestMapping(value="/emails", method = RequestMethod.POST)
	public UserAllBean emails(@RequestBody CriteriaBean criteriaBean) throws SQLException{
		UserAllBean bean = new UserAllBean();
		
		bean = usertableDao.emails(criteriaBean.getYear());
	
		return bean;
	}


// end class
	
}
