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

@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter pw=response.getWriter();
		pw.println("<html><body>");  
		String name= request.getParameter("name");
		String pass=request.getParameter("pass");
		JDBCConnection con;
		try {
			con = new JDBCConnection();
			//con.insert(new Student("Abhay","0827"));
		if(con.check(name, pass)) {
			ArrayList <String> list= con.showdata();
			request.setAttribute("name", list);
			//pw.println(list);
			//response.sendRedirect("Display.jsp");
			RequestDispatcher rd= request.getRequestDispatcher("Display.jsp");
			rd.forward(request, response);
		}
		else
		{
		  pw.println("<h4>Login Failed: Try again</h4>");
		 
		}
		pw.println("</body></html>");  
		pw.close();
		}
catch (SQLException e) {
			
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}