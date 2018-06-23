package com.bru.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bru.model.AmountBean;

import com.bru.model.MoneyBean;
import com.bru.model.PorepaidhistoryBean;
import com.bru.model.TransfermoneyBean;

import com.bru.util.ConnectDB;

@Repository
public class HistoryDao {

	// เติมเงิน
	public void recharge(MoneyBean bean ) throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();
		try {
			sql.append(" INSERT INTO  money(mo_idcradmoney,mo_money,mo_staus) VALUES(?,?,?) ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, bean.getMoIdcradmoney());
			prepared.setLong(2, bean.getMoMoney());
			prepared.setString(3, "1");
			prepared.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		finally {
			conn.close();
		}			
	}
	
	public AmountBean amo(String email) throws SQLException{
		
		AmountBean bean = new AmountBean();
		ConnectDB con = new ConnectDB();
			PreparedStatement prepared = null;
			StringBuilder sql = new StringBuilder();
			Connection conn = con.openConnect();
			
			
			try {
				sql.append(" SELECT * FROM  amount WHERE am_email = ?  ");
				prepared = conn.prepareStatement(sql.toString());
				prepared.setString(1,email);
			

				ResultSet rs = prepared.executeQuery();
				while (rs.next()) {
				bean.setAmEmail(rs.getString("am_email"));
				bean.setAmMoney(rs.getInt("am_money"));
				}

		}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				conn.close();
			}
			return bean ;
			
		} 
	public void gotomon2da(String email , int money) throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();

		try {
			sql.append("UPDATE amount SET am_money = ?  WHERE  am_email = ? ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setInt(1, money);
			prepared.setString(2, email);
			prepared.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			conn.close();
		}
	}
	
	
	public void transfmoney(TransfermoneyBean bean ) throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();
		try {
			sql.append(" INSERT INTO  transfermoney(tr_emailuser,tr_monney,tr_emailmember,tr_date) VALUES(?,?,?,?) ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, bean.getTrEmailuser());
			prepared.setString(2, bean.getTrEonney());
			prepared.setString(3, bean.getTrEmailmember());
			prepared.setDate(4, new Date(bean.getTrDate().getTime()));
			prepared.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		finally {
			conn.close();
		}			
	}
	
public List<PorepaidhistoryBean> findAll1() throws SQLException {
		
	PorepaidhistoryBean bean = new PorepaidhistoryBean();
		List<PorepaidhistoryBean> list = new ArrayList<PorepaidhistoryBean>();
//		query master data
		
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();

		try {
			sql.append(" SELECT * FROM porepaidhistory  ");
			prepared = conn.prepareStatement(sql.toString());
			ResultSet rs = prepared.executeQuery();

			while (rs.next()) {
				bean = new PorepaidhistoryBean();
				bean.setPh_email(rs.getString("ph_email"));
				bean.setPh_idcard(rs.getString("ph_idcard"));
				bean.setPh_money(rs.getString("ph_money"));
				bean.setPh_date(rs.getDate("ph_date"));
				list.add(bean);
		
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			conn.close();
		}
		return list;
	}
public List<TransfermoneyBean> findAll2() throws SQLException {
	
	TransfermoneyBean bean = new TransfermoneyBean();
		List<TransfermoneyBean> list = new ArrayList<TransfermoneyBean>();
//		query master data
		
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();

		try {
			sql.append(" SELECT * FROM transfermoney  ");
			prepared = conn.prepareStatement(sql.toString());
			ResultSet rs = prepared.executeQuery();

			while (rs.next()) {
				bean = new TransfermoneyBean();
				bean.setTrEmailmember(rs.getString("tr_emailmember"));
				bean.setTrEmailuser(rs.getString("tr_emailuser"));
				bean.setTrEonney(rs.getString("tr_monney"));
				bean.setTrDate(rs.getDate("tr_date"));
				list.add(bean);
		
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			conn.close();
		}
		return list;
	}
	// end class
}
