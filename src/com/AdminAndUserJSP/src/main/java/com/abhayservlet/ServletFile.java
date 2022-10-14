package com.abhayservlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletFile")
public class ServletFile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter pw=response.getWriter();
		String name= request.getParameter("name");
		String type= request.getParameter("type");
		String add= request.getParameter("add");
		String email= request.getParameter("email");
		int age= Integer.parseInt(request.getParameter("age"));
		String pass= request.getParameter("pass");
		try {
			JDBCConnection con= new JDBCConnection();
			con.insert(new UserDetails(name,type,add,email,age,pass));
			RequestDispatcher rd= request.getRequestDispatcher("Display.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}