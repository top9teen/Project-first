package com.bru.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.bru.model.PorepaidhistoryBean;
import com.bru.model.TransfermoneyBean;
import com.bru.util.ConnectDB;

@Repository
public class PorepaidhistoryDao {

	public void porepaidhistory(PorepaidhistoryBean bean) throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();
		try {
			sql.append(
					" INSERT INTO  porepaidhistory(ph_email,ph_idcard,ph_money,ph_date) VALUES(?,?,?,?) ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, bean.getPh_email());
			prepared.setString(2, bean.getPh_idcard());
			prepared.setString(3, bean.getPh_money());
			prepared.setDate(4, new Date(bean.getPh_date().getTime()));

			prepared.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			conn.close();
		}
	}
	
	public void transfermoney(TransfermoneyBean bean) throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();
		try {
			sql.append(
					" INSERT INTO  transfermoney(tr_emailuser,tr_emailmember,tr_monney,tr_date) VALUES(?,?,?,?) ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, bean.getTrEmailuser());
			prepared.setString(2, bean.getTrEmailmember());
			prepared.setString(3, bean.getTrEonney());
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
	
	// end class
}

