package com.abhayservlet;

import java.io.IOException;
import java.io.PrintWriter;

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
		if(name.equalsIgnoreCase("Abhay")&&pass.equalsIgnoreCase("8827"))
		 pw.println("Welcome "+ name+"!");
		else
		{
		  pw.println("<h4>Login Failed: Try again</h4>");
		 
		}
		//pw.println("<h3>Welcome</h3>" + name);
		pw.println("</body></html>");  
		  
		pw.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
