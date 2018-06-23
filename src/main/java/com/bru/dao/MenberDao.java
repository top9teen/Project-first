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
import com.bru.model.MsgadminBean;
import com.bru.model.RegisterallBean;
import com.bru.model.RegnameBean;

import com.bru.model.UpdatecarBean;
import com.bru.model.UserAllBean;
import com.bru.util.ConnectDB;


@Repository
public class MenberDao {

	public List<RegisterallBean> listuser(String name) throws SQLException {
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		List<RegisterallBean> list = new ArrayList<>();
		RegisterallBean bean = new RegisterallBean();
		Connection conn = con.openConnect();

		try {

			sql.append(" SELECT * FROM  registerall WHERE reg_bankname = ? ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, name);
			ResultSet rs = prepared.executeQuery();

			while (rs.next()) {
				bean = new RegisterallBean();
				bean.setRegStatusmember(rs.getString("reg_statusmember"));
				if(bean.getRegStatusmember().equals("1")) {
				
					bean.setRegId(rs.getInt("reg_id"));
					bean.setRegBankname(rs.getString("reg_bankname"));
					bean.setRegFirstname(rs.getString("reg_firstname"));
					bean.setRegLastname(rs.getString("reg_lastname"));
					bean.setRegAge(rs.getInt("reg_age"));
					bean.setRegProvince(rs.getString("reg_province"));
					bean.setRegTelephone(rs.getString("reg_telephone"));
					bean.setRegIdCard(rs.getString("reg_idcard"));
					bean.setRegEmail(rs.getString("reg_email"));
					bean.setRegCarmodel(rs.getString("reg_carmodel"));
					bean.setRegCarmake(rs.getString("reg_carmake"));
					bean.setRegTotalincome(rs.getString("reg_totalincome"));
					bean.setRegSalary(rs.getString("reg_salary"));
					bean.setRegLesslimit(rs.getString("reg_lesslimit"));
					bean.setRegLessday(rs.getString("reg_lessday"));
					bean.setRegImgfront(rs.getString("reg_imgfront"));
					bean.setRegImgback(rs.getString("reg_imgback"));
					bean.setRegImgLeft(rs.getString("reg_imgleft"));
					bean.setRegImgright(rs.getString("reg_imgright"));
					bean.setRegDate(rs.getDate("reg_date"));
					bean.setRegDistrict(rs.getString("reg_district"));
					bean.setRegmoban(rs.getString("reg_moban"));
					bean.setRegAmphur(rs.getString("reg_amphur"));
					bean.setRegLat(rs.getString("reg_lat"));
					bean.setRegLog(rs.getString("reg_log"));
					bean.setRegLessdayformy(rs.getString("reg_lessdaytomy"));
					bean.setRegReadtext(rs.getString("reg_readtext"));
					list.add(bean);
				}
				
				
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			conn.close();
		}
		return list;
	}

	public List<RegisterallBean> listuserss(String name) throws SQLException {
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		List<RegisterallBean> list = new ArrayList<>();
		RegisterallBean bean = new RegisterallBean();
		Connection conn = con.openConnect();

		try {

			sql.append(" SELECT * FROM  registerall WHERE reg_bankname = ? ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, name);
			ResultSet rs = prepared.executeQuery();

			while (rs.next()) {
				bean = new RegisterallBean();
				bean.setRegStatusmember(rs.getString("reg_statusmember"));
				if(bean.getRegStatusmember().equals("2")) {
				
					bean.setRegId(rs.getInt("reg_id"));
					bean.setRegBankname(rs.getString("reg_bankname"));
					bean.setRegFirstname(rs.getString("reg_firstname"));
					bean.setRegLastname(rs.getString("reg_lastname"));
					bean.setRegAge(rs.getInt("reg_age"));
					bean.setRegProvince(rs.getString("reg_province"));
					bean.setRegTelephone(rs.getString("reg_telephone"));
					bean.setRegIdCard(rs.getString("reg_idcard"));
					bean.setRegEmail(rs.getString("reg_email"));
					bean.setRegCarmodel(rs.getString("reg_carmodel"));
					bean.setRegCarmake(rs.getString("reg_carmake"));
					bean.setRegTotalincome(rs.getString("reg_totalincome"));
					bean.setRegSalary(rs.getString("reg_salary"));
					bean.setRegLesslimit(rs.getString("reg_lesslimit"));
					bean.setRegLessday(rs.getString("reg_lessday"));
					bean.setRegImgfront(rs.getString("reg_imgfront"));
					bean.setRegImgback(rs.getString("reg_imgback"));
					bean.setRegImgLeft(rs.getString("reg_imgleft"));
					bean.setRegImgright(rs.getString("reg_imgright"));
					bean.setRegDate(rs.getDate("reg_date"));
					bean.setRegDistrict(rs.getString("reg_district"));
					bean.setRegmoban(rs.getString("reg_moban"));
					bean.setRegAmphur(rs.getString("reg_amphur"));
					bean.setRegLat(rs.getString("reg_lat"));
					bean.setRegLog(rs.getString("reg_log"));
					bean.setRegLessdayformy(rs.getString("reg_lessdaytomy"));
					bean.setRegReadtext(rs.getString("reg_readtext"));
					list.add(bean);
				}
				
				
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			conn.close();
		}
		return list;
	}
	public List<RegisterallBean> listuserdddd(String name) throws SQLException {
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		List<RegisterallBean> list = new ArrayList<>();
		RegisterallBean bean = new RegisterallBean();
		Connection conn = con.openConnect();

		try {

			sql.append(" SELECT * FROM  registerall WHERE reg_bankname = ? ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, name);
			ResultSet rs = prepared.executeQuery();

			while (rs.next()) {
				bean = new RegisterallBean();
				bean.setRegStatusmember(rs.getString("reg_statusmember"));
				if(bean.getRegStatusmember().equals("4")) {
				
					bean.setRegId(rs.getInt("reg_id"));
					bean.setRegBankname(rs.getString("reg_bankname"));
					bean.setRegFirstname(rs.getString("reg_firstname"));
					bean.setRegLastname(rs.getString("reg_lastname"));
					bean.setRegAge(rs.getInt("reg_age"));
					bean.setRegProvince(rs.getString("reg_province"));
					bean.setRegTelephone(rs.getString("reg_telephone"));
					bean.setRegIdCard(rs.getString("reg_idcard"));
					bean.setRegEmail(rs.getString("reg_email"));
					bean.setRegCarmodel(rs.getString("reg_carmodel"));
					bean.setRegCarmake(rs.getString("reg_carmake"));
					bean.setRegTotalincome(rs.getString("reg_totalincome"));
					bean.setRegSalary(rs.getString("reg_salary"));
					bean.setRegLesslimit(rs.getString("reg_lesslimit"));
					bean.setRegLessday(rs.getString("reg_lessday"));
					bean.setRegImgfront(rs.getString("reg_imgfront"));
					bean.setRegImgback(rs.getString("reg_imgback"));
					bean.setRegImgLeft(rs.getString("reg_imgleft"));
					bean.setRegImgright(rs.getString("reg_imgright"));
					bean.setRegDate(rs.getDate("reg_date"));
					bean.setRegDistrict(rs.getString("reg_district"));
					bean.setRegmoban(rs.getString("reg_moban"));
					bean.setRegAmphur(rs.getString("reg_amphur"));
					bean.setRegLat(rs.getString("reg_lat"));
					bean.setRegLog(rs.getString("reg_log"));
					bean.setRegLessdayformy(rs.getString("reg_lessdaytomy"));
					bean.setRegReadtext(rs.getString("reg_readtext"));
					list.add(bean);
				}
				
				
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			conn.close();
		}
		return list;
	}
	public List<RegisterallBean> listuser2(String name)   throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		List<RegisterallBean> list = new ArrayList<>();
		RegisterallBean bean = new RegisterallBean();
		Connection conn = con.openConnect();

		try {

			sql.append(" SELECT * FROM  registerall WHERE reg_bankname = ? ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, name);
			ResultSet rs = prepared.executeQuery();

			while (rs.next()) {
				bean = new RegisterallBean();
				bean.setRegStatusmember(rs.getString("reg_statusmember"));
				if(bean.getRegStatusmember().equals("2")) {
					bean.setRegId(rs.getInt("reg_id"));
					bean.setRegFirstname(rs.getString("reg_firstname"));
					bean.setRegLastname(rs.getString("reg_lastname"));
					bean.setRegTelephone(rs.getString("reg_telephone"));
					bean.setRegProvince(rs.getString("reg_province"));
					bean.setRegCarmake(rs.getString("reg_carmake"));
					bean.setRegLesslimit(rs.getString("reg_lesslimit"));
					list.add(bean);
				}
			
			
				
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			conn.close();
		}
		return list;
	}

	// adminsel1
	public List<RegisterallBean> listuser1()  throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		List<RegisterallBean> list = new ArrayList<>();
		RegisterallBean bean = new RegisterallBean();
		Connection conn = con.openConnect();

		try {

			sql.append(" SELECT * FROM  registerall  ");
			prepared = conn.prepareStatement(sql.toString());
			ResultSet rs = prepared.executeQuery();

			while (rs.next()) {
				bean = new RegisterallBean();
				bean.setRegStatusmember(rs.getString("reg_statusmember"));
				if(bean.getRegStatusmember().equals("1")) {
				
					bean.setRegId(rs.getInt("reg_id"));
					bean.setRegBankname(rs.getString("reg_bankname"));
					bean.setRegFirstname(rs.getString("reg_firstname"));
					bean.setRegLastname(rs.getString("reg_lastname"));
					bean.setRegAge(rs.getInt("reg_age"));
					bean.setRegProvince(rs.getString("reg_province"));
					bean.setRegTelephone(rs.getString("reg_telephone"));
					bean.setRegIdCard(rs.getString("reg_idcard"));
					bean.setRegEmail(rs.getString("reg_email"));
					bean.setRegCarmodel(rs.getString("reg_carmodel"));
					bean.setRegCarmake(rs.getString("reg_carmake"));
					bean.setRegTotalincome(rs.getString("reg_totalincome"));
					bean.setRegSalary(rs.getString("reg_salary"));
					bean.setRegLesslimit(rs.getString("reg_lesslimit"));
					bean.setRegLessday(rs.getString("reg_lessday"));
					bean.setRegImgfront(rs.getString("reg_imgfront"));
					bean.setRegImgback(rs.getString("reg_imgback"));
					bean.setRegImgLeft(rs.getString("reg_imgleft"));
					bean.setRegImgright(rs.getString("reg_imgright"));
					bean.setRegDate(rs.getDate("reg_date"));
					bean.setRegDistrict(rs.getString("reg_district"));
					bean.setRegmoban(rs.getString("reg_moban"));
					bean.setRegAmphur(rs.getString("reg_amphur"));
					bean.setRegLat(rs.getString("reg_lat"));
					bean.setRegLog(rs.getString("reg_log"));
					bean.setRegLessdayformy(rs.getString("reg_lessdaytomy"));
					bean.setRegReadtext(rs.getString("reg_readtext"));
					list.add(bean);
				}}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			conn.close();
		}
		return list;
	}

	public List<RegisterallBean> listuser3()  throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		List<RegisterallBean> list = new ArrayList<>();
		RegisterallBean bean = new RegisterallBean();
		Connection conn = con.openConnect();

		try {

			sql.append(" SELECT * FROM  registerall ");
			prepared = conn.prepareStatement(sql.toString());
			ResultSet rs = prepared.executeQuery();

			while (rs.next()) {
				bean = new RegisterallBean();
				bean.setRegStatusmember(rs.getString("reg_statusmember"));
				if(bean.getRegStatusmember().equals("5")) {
				
					bean.setRegId(rs.getInt("reg_id"));
					bean.setRegBankname(rs.getString("reg_bankname"));
					bean.setRegFirstname(rs.getString("reg_firstname"));
					bean.setRegLastname(rs.getString("reg_lastname"));
					bean.setRegAge(rs.getInt("reg_age"));
					bean.setRegProvince(rs.getString("reg_province"));
					bean.setRegTelephone(rs.getString("reg_telephone"));
					bean.setRegIdCard(rs.getString("reg_idcard"));
					bean.setRegEmail(rs.getString("reg_email"));
					bean.setRegCarmodel(rs.getString("reg_carmodel"));
					bean.setRegCarmake(rs.getString("reg_carmake"));
					bean.setRegTotalincome(rs.getString("reg_totalincome"));
					bean.setRegSalary(rs.getString("reg_salary"));
					bean.setRegLesslimit(rs.getString("reg_lesslimit"));
					bean.setRegLessday(rs.getString("reg_lessday"));
					bean.setRegImgfront(rs.getString("reg_imgfront"));
					bean.setRegImgback(rs.getString("reg_imgback"));
					bean.setRegImgLeft(rs.getString("reg_imgleft"));
					bean.setRegImgright(rs.getString("reg_imgright"));
					bean.setRegDate(rs.getDate("reg_date"));
					bean.setRegDistrict(rs.getString("reg_district"));
					bean.setRegmoban(rs.getString("reg_moban"));
					bean.setRegAmphur(rs.getString("reg_amphur"));
					bean.setRegLat(rs.getString("reg_lat"));
					bean.setRegLog(rs.getString("reg_log"));
					bean.setRegLessdayformy(rs.getString("reg_lessdaytomy"));
					bean.setRegReadtext(rs.getString("reg_readtext"));
					list.add(bean);
			}}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			conn.close();
		}
		return list;
	}

	public void sssss(MsgadminBean bean) throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();
		try {
			sql.append("INSERT INTO msgadmin(ms_name,ms_msghard,ms_msgbody,ms_date,ms_email,ms_staus) VALUES(?,?,?,?,?,?)");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, bean.getMsName());
			prepared.setString(2, bean.getMsMsghard());
			prepared.setString(3, bean.getMsMsgbody());
			prepared.setDate(4, new Date(bean.getMsDate().getTime()));
			prepared.setString(5, "admin@hotmail.com");
			prepared.setString(6, "1");
			
			prepared.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			conn.close();
		}

	}

	
	public void sssssss(MsgadminBean bean) throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();
		try {
			sql.append("INSERT INTO msgadmin(ms_name,ms_msghard,ms_msgbody,ms_date,ms_email,ms_staus) VALUES(?,?,?,?,?,?)");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, bean.getMsName());
			prepared.setString(2, bean.getMsMsghard());
			prepared.setString(3, bean.getMsMsgbody());
			prepared.setDate(4, new Date(bean.getMsDate().getTime()));
			prepared.setString(5, bean.getMsEmail());
			prepared.setString(6, "1");
			
			prepared.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			conn.close();
		}

	}
	public void dsdadsa(MsgadminBean bean) throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();
		try {
			sql.append("INSERT INTO msgadmin(ms_name,ms_msghard,ms_msgbody,ms_date,ms_email,ms_staus) VALUES(?,?,?,?,?,?)");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, "admin@hotmail.com");
			prepared.setString(2, bean.getMsMsghard());
			prepared.setString(3, bean.getMsMsgbody());
			prepared.setDate(4, new Date(bean.getMsDate().getTime()));
			prepared.setString(5,  bean.getMsName());
			prepared.setString(6, "1");
			
			prepared.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			conn.close();
		}

	}
	
	public List<MsgadminBean> listmsg() throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		List<MsgadminBean> list = new ArrayList<>();
		MsgadminBean bean = new MsgadminBean();
		Connection conn = con.openConnect();

		try {

			sql.append(" SELECT * FROM  msgadmin WHERE ms_staus = ?  ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, "1");
			ResultSet rs = prepared.executeQuery();

			while (rs.next()) {
				bean = new MsgadminBean();
				bean.setMsId(rs.getInt("ms_id"));
				bean.setMsMsgbody(rs.getString("ms_msgbody"));
				bean.setMsMsghard(rs.getString("ms_msghard"));
				bean.setMsName(rs.getString("ms_name"));
				bean.setMsDate(rs.getDate("ms_date"));
				
				list.add(bean);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			conn.close();
		}
		return list;
	}
	
	public List<MsgadminBean> listmsgww( String email) throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		List<MsgadminBean> list = new ArrayList<>();
		MsgadminBean bean = new MsgadminBean();
		Connection conn = con.openConnect();

		try {

			sql.append(" SELECT * FROM  msgadmin WHERE ms_staus = ? AND ms_email = ?  ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, "1");
			prepared.setString(2, email);
			ResultSet rs = prepared.executeQuery();

			while (rs.next()) {
				bean = new MsgadminBean();
				bean.setMsId(rs.getInt("ms_id"));
				bean.setMsMsgbody(rs.getString("ms_msgbody"));
				bean.setMsMsghard(rs.getString("ms_msghard"));
				bean.setMsName(rs.getString("ms_name"));
				bean.setMsDate(rs.getDate("ms_date"));
				bean.setMsEmail(rs.getString("ms_email"));
				
				
				list.add(bean);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			conn.close();
		}
		return list;
	}
	
	public List<MsgadminBean> listmsgdsad() throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		List<MsgadminBean> list = new ArrayList<>();
		MsgadminBean bean = new MsgadminBean();
		Connection conn = con.openConnect();

		try {

			sql.append(" SELECT * FROM  msgadmin WHERE ms_staus = ? ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, "2");
			ResultSet rs = prepared.executeQuery();

			while (rs.next()) {
				bean = new MsgadminBean();
				bean.setMsId(rs.getInt("ms_id"));
				bean.setMsMsgbody(rs.getString("ms_msgbody"));
				bean.setMsMsghard(rs.getString("ms_msghard"));
				bean.setMsName(rs.getString("ms_name"));
				bean.setMsDate(rs.getDate("ms_date"));
				
				list.add(bean);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			conn.close();
		}
		return list;
	}

	// update
	public void ka2(UpdatecarBean bean) throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();

		try {
			sql.append("UPDATE kasikorn_price SET ka_price = ? WHERE  br_name = ? ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setInt(1, bean.getKa());

			prepared.setString(2, bean.getCar());

			prepared.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			conn.close();
		}
	}

	public void kr2(UpdatecarBean bean) throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();

		try {
			sql.append("UPDATE krungsri_price SET kr_price = ? WHERE br_name = ? ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setInt(1, bean.getKr());

			prepared.setString(2, bean.getCar());

			prepared.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			conn.close();
		}
	}

	public void sc2(UpdatecarBean bean) throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();

		try {
			sql.append("UPDATE scbeasy_price SET sc_price = ? WHERE  br_name = ? ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setInt(1, bean.getSc());
			prepared.setString(2, bean.getCar());

			prepared.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			conn.close();
		}
	}

	public void th2(UpdatecarBean bean) throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();

		try {
			sql.append("UPDATE thanachart_price SET th_price = ? WHERE  br_name = ? ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setInt(1, bean.getTh());
			prepared.setString(2, bean.getCar());
			prepared.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			conn.close();
		}
	}
	public void rester(UserAllBean bean) throws SQLException {
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();
		try {
			sql.append("INSERT INTO userall(us_fname,us_lname,us_address,us_role,us_createdate,us_username,us_password,us_img,us_rights) VALUES(?,?,?,?,?,?,?,?,?)");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, bean.getUsFname());
			prepared.setString(2, bean.getUsLname());
			prepared.setString(3, bean.getUsAddress());
			prepared.setString(4, bean.getUsRole());
			prepared.setDate(5, new Date(bean.getUsCreatedate().getTime()));
			prepared.setString(6, bean.getUsUsername());
			prepared.setString(7, bean.getUsPassword());
			prepared.setString(8, bean.getUsImg());
			prepared.setString(9, bean.getUsUsername());
			prepared.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			conn.close();
		}


		
	}
	
	public void resterdsdd(AmountBean bean) throws SQLException {
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();
		try {
			sql.append("INSERT INTO amount(am_email,am_money) VALUES(?,?)");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, bean.getAmEmail());
			prepared.setInt(2, bean.getAmMoney());
			prepared.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			conn.close();
		}


		
	}
	
	public void sssssdd(UserAllBean bean) throws SQLException {
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();
		try {
			sql.append("INSERT INTO userall(us_fname,us_lname,us_address,us_role,us_createdate,us_username,us_password,us_img,us_rights) VALUES(?,?,?,?,?,?,?,?,?)");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, bean.getUsFname());
			prepared.setString(2, bean.getUsLname());
			prepared.setString(3, bean.getUsAddress());
			prepared.setString(4, bean.getUsRole());
			prepared.setDate(5, new Date(bean.getUsCreatedate().getTime()));
			prepared.setString(6, bean.getUsUsername());
			prepared.setString(7, bean.getUsPassword());
			prepared.setString(8, bean.getUsImg());
			prepared.setString(9, bean.getUsRights());
			prepared.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			conn.close();
		}


		
	}
	
	public List<RegisterallBean> listuserv(String name) throws SQLException {
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		List<RegisterallBean> list = new ArrayList<>();
		RegisterallBean bean = new RegisterallBean();
		Connection conn = con.openConnect();

		try {

			sql.append(" SELECT * FROM  registerall WHERE reg_bankname = ? ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, name);
			ResultSet rs = prepared.executeQuery();

			while (rs.next()) {
				bean = new RegisterallBean();
				bean.setRegStatusmember(rs.getString("reg_statusmember"));
				if(bean.getRegStatusmember().equals("3")) {
				
					bean.setRegId(rs.getInt("reg_id"));
					bean.setRegBankname(rs.getString("reg_bankname"));
					bean.setRegFirstname(rs.getString("reg_firstname"));
					bean.setRegLastname(rs.getString("reg_lastname"));
					bean.setRegAge(rs.getInt("reg_age"));
					bean.setRegProvince(rs.getString("reg_province"));
					bean.setRegTelephone(rs.getString("reg_telephone"));
					bean.setRegIdCard(rs.getString("reg_idcard"));
					bean.setRegEmail(rs.getString("reg_email"));
					bean.setRegCarmodel(rs.getString("reg_carmodel"));
					bean.setRegCarmake(rs.getString("reg_carmake"));
					bean.setRegTotalincome(rs.getString("reg_totalincome"));
					bean.setRegSalary(rs.getString("reg_salary"));
					bean.setRegLesslimit(rs.getString("reg_lesslimit"));
					bean.setRegLessday(rs.getString("reg_lessday"));
					bean.setRegImgfront(rs.getString("reg_imgfront"));
					bean.setRegImgback(rs.getString("reg_imgback"));
					bean.setRegImgLeft(rs.getString("reg_imgleft"));
					bean.setRegImgright(rs.getString("reg_imgright"));
					bean.setRegDate(rs.getDate("reg_date"));
					bean.setRegDistrict(rs.getString("reg_district"));
					bean.setRegmoban(rs.getString("reg_moban"));
					bean.setRegAmphur(rs.getString("reg_amphur"));
					bean.setRegLat(rs.getString("reg_lat"));
					bean.setRegLog(rs.getString("reg_log"));
					bean.setRegLessdayformy(rs.getString("reg_lessdaytomy"));
					bean.setRegReadtext(rs.getString("reg_readtext"));
					list.add(bean);
				}
				
				
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			conn.close();
		}
		return list;
	}
	public List<RegisterallBean> listuserv65(String name) throws SQLException {
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		List<RegisterallBean> list = new ArrayList<>();
		RegisterallBean bean = new RegisterallBean();
		Connection conn = con.openConnect();

		try {

			sql.append(" SELECT * FROM  registerall WHERE reg_bankname = ? ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, name);
			ResultSet rs = prepared.executeQuery();

			while (rs.next()) {
				bean = new RegisterallBean();
				bean.setRegStatusmember(rs.getString("reg_statusmember"));
				if(bean.getRegStatusmember().equals("5")) {
				
					bean.setRegId(rs.getInt("reg_id"));
					bean.setRegBankname(rs.getString("reg_bankname"));
					bean.setRegFirstname(rs.getString("reg_firstname"));
					bean.setRegLastname(rs.getString("reg_lastname"));
					bean.setRegAge(rs.getInt("reg_age"));
					bean.setRegProvince(rs.getString("reg_province"));
					bean.setRegTelephone(rs.getString("reg_telephone"));
					bean.setRegIdCard(rs.getString("reg_idcard"));
					bean.setRegEmail(rs.getString("reg_email"));
					bean.setRegCarmodel(rs.getString("reg_carmodel"));
					bean.setRegCarmake(rs.getString("reg_carmake"));
					bean.setRegTotalincome(rs.getString("reg_totalincome"));
					bean.setRegSalary(rs.getString("reg_salary"));
					bean.setRegLesslimit(rs.getString("reg_lesslimit"));
					bean.setRegLessday(rs.getString("reg_lessday"));
					bean.setRegImgfront(rs.getString("reg_imgfront"));
					bean.setRegImgback(rs.getString("reg_imgback"));
					bean.setRegImgLeft(rs.getString("reg_imgleft"));
					bean.setRegImgright(rs.getString("reg_imgright"));
					bean.setRegDate(rs.getDate("reg_date"));
					bean.setRegDistrict(rs.getString("reg_district"));
					bean.setRegmoban(rs.getString("reg_moban"));
					bean.setRegAmphur(rs.getString("reg_amphur"));
					bean.setRegLat(rs.getString("reg_lat"));
					bean.setRegLog(rs.getString("reg_log"));
					bean.setRegLessdayformy(rs.getString("reg_lessdaytomy"));
					bean.setRegReadtext(rs.getString("reg_readtext"));
					list.add(bean);
				}
				
				
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			conn.close();
		}
		return list;
	}
	
	public void gotomon2(String email , int money) throws SQLException{
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
	
	public void gotomon3(String idcard ) throws SQLException{
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();

		try {
			sql.append("UPDATE money SET mo_staus = ?  WHERE  mo_idcradmoney = ? ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1, "2");
			prepared.setString(2, idcard);
			prepared.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			conn.close();
		}
	}
	// end class
}
