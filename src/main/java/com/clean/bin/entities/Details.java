package com.clean.bin.entities;

import java.sql.Timestamp;

public class Details {

	private int dId;
	private String dName;
	private long dMobileNo;

	public Details(int dId, String dName, long dMobileNo) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dMobileNo = dMobileNo;
	}

	public Details(String dName, long dMobileNo) {
		super();
		this.dName = dName;
		this.dMobileNo = dMobileNo;
	}

	public Details() {
		super();
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public long getdMobileNo() {
		return dMobileNo;
	}

	public void setdMobileNo(long dMobileNo) {
		this.dMobileNo = dMobileNo;
	}

}
