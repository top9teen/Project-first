package com.bru.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.bru.model.MoneyBean;
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
}
