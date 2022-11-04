package com.clean.bin.dao;

import java.sql.*;

import com.clean.bin.entities.User;
public class UserDao {
	
	private Connection con;

	public UserDao(Connection con) {
		super();
		this.con = con;
	}
	
	public boolean saveUser(User user) {
		boolean f=false;

		try {
			
			//User --> database
			String query = "insert into user(name,email,password,pincode,address) values(?,?,?,?,?)";
			PreparedStatement pstmt= this.con.prepareStatement(query);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());
			pstmt.setInt(4, user.getPincode());
			pstmt.setString(5, user.getAddress());
			
			pstmt.executeUpdate();
			f=true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	//get user by useremail and userpassword:
	public User getUserByEmailAndPassword(String email , String password) {
		
		User user = null;
		try {
			
			String query = "select * from user where email =? and password =?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			
			ResultSet set = pstmt.executeQuery();
			
			if(set.next()) {
				user = new User();
				
				//data from db
				String name = set.getString("name");
				//set to user object
				user.setName(name);
				user.setId(set.getInt("id"));
				user.setEmail(set.getString("email"));
				user.setPassword(set.getString("password"));
				user.setPincode(set.getInt("pincode"));
				user.setAddress(set.getString("address"));
				user.setDateTime(set.getTimestamp("cdate"));
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return user;
	}
	
	
	public boolean updateUser(User user) {
		boolean f = false;
		try {
			
			String query = "update user set name=? , email=? , password=? , pincode=? , address=? ,  where id=?";
			PreparedStatement p = con.prepareStatement(query);
			p.setString(1 , user.getName());
			p.setString(2, user.getEmail());
			p.setString(3, user.getPassword());
			p.setInt(4, user.getPincode());
			p.setString(5, user.getAddress());
			p.setInt(6, user.getId());
			
			
			p.executeUpdate();
			f = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}

}
