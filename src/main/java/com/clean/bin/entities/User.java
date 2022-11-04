package com.clean.bin.entities;

import java.sql.*;
public class User {

	private int id;
	private String name;
	private String email;
	private String password;
	private int pincode;
	private Timestamp dateTime;
	private String address;
	
	
	public User(int id, String name, String email, String password, int pincode, Timestamp dateTime, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.pincode = pincode;
		this.dateTime = dateTime;
		this.address = address;
	}
	
	


	public User() {
		super();
	}




	public User(String name, String email, String password, int pincode, String address) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.pincode = pincode;
		this.address = address;
	}


	//	Getters and Seters

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public int getPincode() {
		return pincode;
	}




	public void setPincode(int pincode) {
		this.pincode = pincode;
	}




	public Timestamp getDateTime() {
		return dateTime;
	}




	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}



	
	
	
	

}
