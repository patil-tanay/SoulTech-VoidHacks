	package com.clean.bin.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clean.bin.dao.UserDao;
import com.clean.bin.entities.User;
import com.clean.bin.helper.ConnectionProvider;


@WebServlet("/RegisterServlet")
@MultipartConfig
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
			//		fetch all data
		
		PrintWriter out = response.getWriter();
		String check = request.getParameter("check");
		if(check==null) 
		{
			out.println("box not checked");
		}else 
		{
			//baki ka data yaha nikalna h
			String name =request.getParameter("user_name");
			String email =request.getParameter("user_email");
			String password =request.getParameter("user_password"); 
			int pincode = Integer.valueOf(request.getParameter("pincode"));
			String address =request.getParameter("address");
			//Create a user object and set all data to that object..
			User user = new User(name, email, password, pincode, address);
			
			//Create a user dao object..
			UserDao dao = new UserDao(ConnectionProvider.getConnection());
			if(dao.saveUser(user)) {
				//save..
				out.println("done");
			} else {
				out.println("error");
			}
			
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
