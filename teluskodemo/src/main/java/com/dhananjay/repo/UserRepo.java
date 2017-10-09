package com.dhananjay.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.dhananjay.Users;

public class UserRepo {

	private String url="jdbc:mysql://localhost:3306/test";
	private String dbuser = "root";
	private String pwd = "admin";
	
	
	public UserRepo() {

		// Write Database Connection Code
	}

	public Users getUser(int id) {
		String sql = "SELECT * FROM users WHERE user_id = " + id;
		Users user = new Users();
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
			Connection con = DriverManager.getConnection(url,dbuser,pwd);
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
		

			rs.next();
			user.setUname(rs.getString(2));
			user.setUid(rs.getInt(1));
			user.setUemail(rs.getString(3));
			user.setUage(rs.getInt(4));
			
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		return user;

	}

}
