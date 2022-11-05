package com.clean.bin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.clean.bin.entities.Details;

public class DetailsDao {

	private Connection con;

	public DetailsDao(Connection con) {
		super();
		this.con = con;
	}
	
	public boolean saveDetail(Details details) {
		boolean f=false;

		try {
			
			//Details --> database
			String query = "insert into details(name, mobileno) values(?,?)";
			PreparedStatement pstmt= this.con.prepareStatement(query);
			pstmt.setString(1, details.getdName());
			pstmt.setLong(2, details.getdMobileNo());
			
			pstmt.executeUpdate();
			f=true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
