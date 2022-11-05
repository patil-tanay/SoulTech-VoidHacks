package com.clean.bin.entities;

import java.sql.Timestamp;

public class Details {

	private int dId;
	private String dName;
	private long dMobileNo;
	private String schedule;
	private String dAddress;
	private int dPin;
	private String dZone;
	private String dWard;
	private String dLocality;
	private String dLandmark;
	
	public Details(int dId, String dName, long dMobileNo, String schedule, String dAddress, int dPin, String dZone,
			String dWard, String dLocality, String dLandmark) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dMobileNo = dMobileNo;
		this.schedule = schedule;
		this.dAddress = dAddress;
		this.dPin = dPin;
		this.dZone = dZone;
		this.dWard = dWard;
		this.dLocality = dLocality;
		this.dLandmark = dLandmark;
	}

	public Details(String dName, long dMobileNo, String schedule, String dAddress, int dPin, String dZone, String dWard,
			String dLocality, String dLandmark) {
		super();
		this.dName = dName;
		this.dMobileNo = dMobileNo;
		this.schedule = schedule;
		this.dAddress = dAddress;
		this.dPin = dPin;
		this.dZone = dZone;
		this.dWard = dWard;
		this.dLocality = dLocality;
		this.dLandmark = dLandmark;
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

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getdAddress() {
		return dAddress;
	}

	public void setdAddress(String dAddress) {
		this.dAddress = dAddress;
	}

	public int getdPin() {
		return dPin;
	}

	public void setdPin(int dPin) {
		this.dPin = dPin;
	}

	public String getdZone() {
		return dZone;
	}

	public void setdZone(String dZone) {
		this.dZone = dZone;
	}

	public String getdWard() {
		return dWard;
	}

	public void setdWard(String dWard) {
		this.dWard = dWard;
	}

	public String getdLocality() {
		return dLocality;
	}

	public void setdLocality(String dLocality) {
		this.dLocality = dLocality;
	}

	public String getdLandmark() {
		return dLandmark;
	}

	public void setdLandmark(String dLandmark) {
		this.dLandmark = dLandmark;
	}
	
	

	
}
