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
			String query = "insert into details(name, mobileno, daddress, dpin, dzone, dward, dlocality, dlandmark) values(?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt= this.con.prepareStatement(query);
			pstmt.setString(1, details.getdName());
			pstmt.setLong(2, details.getdMobileNo());
			pstmt.setString(3, details.getdAddress());
			pstmt.setInt(4, details.getdPin());
			pstmt.setString(5, details.getdZone());
			pstmt.setString(6, details.getdWard());
			pstmt.setString(7, details.getdLocality());
			pstmt.setString(8, details.getdLandmark());			
			pstmt.executeUpdate();
			f=true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
