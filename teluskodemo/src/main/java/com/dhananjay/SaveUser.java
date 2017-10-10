package com.dhananjay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dhananjay.repo.UserRepo;


public class SaveUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SaveUser() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
				
			PrintWriter out = response.getWriter();
			int id = Integer.parseInt(request.getParameter("id"));
			int age = Integer.parseInt(request.getParameter("age"));
			Users user = new Users();
			UserRepo repo = new UserRepo();
		
			user.setUname(request.getParameter("name"));
			user.setUemail(request.getParameter("email"));
			user.setUage(age);
			user.setUid(id);
			//System.out.println(user.getUname() + user.getUemail() + user.getUage());
			repo.saveUser(user);
			
					out.println("Data Saved ");
		
	}

}
