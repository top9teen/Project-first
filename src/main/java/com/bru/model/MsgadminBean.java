package com.bru.model;

import java.util.Date;

public class MsgadminBean {
	
	private int msId;
	private String msName;
	private String msMsghard;
	private String msMsgbody;
	private Date msDate;
	private String msEmail;
	private String msStaus;
	
	
	
	public String getMsEmail() {
		return msEmail;
	}
	public void setMsEmail(String msEmail) {
		this.msEmail = msEmail;
	}
	public String getMsStaus() {
		return msStaus;
	}
	public void setMsStaus(String msStaus) {
		this.msStaus = msStaus;
	}
	public Date getMsDate() {
		return msDate;
	}
	public void setMsDate(Date msDate) {
		this.msDate = msDate;
	}
	public int getMsId() {
		return msId;
	}
	public void setMsId(int msId) {
		this.msId = msId;
	}
	public String getMsName() {
		return msName;
	}
	public void setMsName(String msName) {
		this.msName = msName;
	}
	public String getMsMsghard() {
		return msMsghard;
	}
	public void setMsMsghard(String msMsghard) {
		this.msMsghard = msMsghard;
	}
	public String getMsMsgbody() {
		return msMsgbody;
	}
	public void setMsMsgbody(String msMsgbody) {
		this.msMsgbody = msMsgbody;
	}
	
}
