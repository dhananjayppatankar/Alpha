package com.dhananjay.repo;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserRepoConstructor {

	
	private String url="jdbc:mysql://localhost:3306/test";
	private String dbuser = "root";
	private String pwd = "admin";
	
	public UserRepoConstructor(){
		
		try{
		Class.forName("com.jdbc.mysql.Driver");
		Connection con = DriverManager.getConnection(url, dbuser, pwd);
		
		}catch(Exception e){System.out.println(e);}
		
		
		
		
		
		
	}
	
	
	
	
	
}
