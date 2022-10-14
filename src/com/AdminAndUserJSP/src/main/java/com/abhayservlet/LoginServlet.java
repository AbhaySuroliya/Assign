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


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter pw=response.getWriter();
		String name= request.getParameter("name");
		String pass= request.getParameter("pass");
		JDBCConnection con;
		try {
			con = new JDBCConnection();
			String s=con.check(name, pass);
			if (s.equals("user"))
			{
				UserDetails ud= con.getDetails(name, pass);
				request.setAttribute("name", ud);
				RequestDispatcher rd= request.getRequestDispatcher("Display.jsp");
				rd.forward(request, response);
				
			}
			else if(s.equalsIgnoreCase("admin"))
			{
				ArrayList<UserDetails> lst=con.getAll();
				request.setAttribute("list", lst);
				RequestDispatcher rp=request.getRequestDispatcher("DisplayAdmin.jsp");
				rp.forward(request, response);
			}
			else {
				pw.println("<html><body>");  
				pw.println("<h4>Login Failed: Try again</h4>");
				pw.println("<a href='login.html'>login again</a>");
				pw.println("</body></html>");  
				pw.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
