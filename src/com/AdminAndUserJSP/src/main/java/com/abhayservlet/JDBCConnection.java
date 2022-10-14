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
	  public void insert(UserDetails s) throws SQLException {
		  
          PreparedStatement ps=con.prepareStatement("insert into data values(?,?,?,?,?,?)");
          ps.setString(1,s.getName()); 
          ps.setString(2,s.getType());
          ps.setString(3,s.getAdd());
          ps.setString(4,s.getEmail());
          ps.setInt(5,s.getAge());
          ps.setString(6,s.getPass());
          ps.executeUpdate();
          ps.close();
	  }
	  public String check(String name,String pass) throws SQLException {
		  String t="invalid";
		  String s="select * from data";
			 PreparedStatement ps=con.prepareStatement(s);
			 ResultSet set=ps.executeQuery();
			 while(set.next())
			 {
				 if(set.getString(1).equals(name)&&set.getString(6).equals(pass))
				 {
					 if(set.getString(2).equalsIgnoreCase("user"))
						 return "user";
					 else
						 return "admin";
				 }
			 }
			 return t;
	  }
	 public UserDetails getDetails(String name,String pass) throws SQLException {

		 UserDetails s = null;
		 PreparedStatement ps=con.prepareStatement("select * from data where name=? and pass=?");
		 ps.setString(1,name);
		 ps.setString(2,pass);
		 ResultSet set=ps.executeQuery();
		 while(set.next())
		 {
	       s=new UserDetails(set.getString(1),set.getString(2),set.getString(3),set.getString(4),set.getInt(5),set.getString(6));
		 }
		 ps.close();
		 return s;
	 }
	 public ArrayList<UserDetails> getAll() throws SQLException {
		 ArrayList<UserDetails> list=new ArrayList<UserDetails>();
		 String s="select * from data ";
		 PreparedStatement ps=con.prepareStatement(s);
		 ResultSet set=ps.executeQuery();
		 while(set.next())
		 {
	       list.add(new UserDetails(set.getString(1),set.getString(2),set.getString(3),set.getString(4),set.getInt(5),set.getString(6)));
		 }
		 return list;
	 }
	

}
