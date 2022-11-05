package com.clean.bin.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clean.bin.dao.DetailsDao;
import com.clean.bin.entities.Details;
import com.clean.bin.helper.ConnectionProvider;

/**
 * Servlet implementation class DetailsServlet
 */
@WebServlet("/DetailsServlet")
public class DetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String dName =request.getParameter("dName");
		long dMobileNo = Long.parseLong(request.getParameter("dMobileNo"));
		String schedule =request.getParameter("schedule");
		String dAddress =request.getParameter("dAddress");
		int dPin = Integer.valueOf(request.getParameter("dPin"));
		String dZone =request.getParameter("dZone");
		String dWard =request.getParameter("dWard");
		String dLocality =request.getParameter("dLocality");
		String dLandmark =request.getParameter("dLandmark");
		Details details = new Details(dName , dMobileNo , schedule , dAddress, dPin, dZone ,dWard,dLocality, dLandmark);
		
		DetailsDao dao = new DetailsDao(ConnectionProvider.getConnection());
		
		if(dao.saveDetail(details)) {
			//save..
			response.sendRedirect("confirm.jsp");
			out.println("done");
		} else {
			out.println("error");
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
