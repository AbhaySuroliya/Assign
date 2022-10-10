package com.abhayservlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
public class JDBCConnection{
	Connection con;
	static int val=100;
	 public JDBCConnection() throws SQLException
	 {
		 this.con=(Connection) getConnection();
	 }
      public  Connection getConnection() throws SQLException {
    			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    			String url="jdbc:oracle:thin:@localhost:1521/orcl.iiht.tech";
    			String userName="system";
    			String password="root";
    			 con=DriverManager.getConnection(url,userName,password);
    		   	  return con;
      }
	  public void insert(Student s) throws SQLException {
		  ++val;
          PreparedStatement ps=con.prepareStatement("insert into stud_data values(?,?)");
          ps.setString(1,s.getName()); 
          ps.setString(2,s.getPass());
          ps.executeUpdate();
          ps.close();
	  }
	 public boolean check(String name, String pass) throws SQLException
	 {
		 String s="select * from stud_data";
		 PreparedStatement ps=con.prepareStatement(s);
		 ResultSet set=ps.executeQuery();
		 while(set.next())
		 {
			 if(set.getString(1).equals(name)&&set.getString(2).equals(pass))
				 return true;
		 }
		 return false;
	 }

}
