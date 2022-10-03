package day11.firstjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
public class StudentData {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url="jdbc:oracle:thin:@localhost:1521/orcl.iiht.tech";
			String username="system";
			String password="system";
			Connection con =DriverManager.getConnection(url,username,password);
			System.out.println("Connection is Successful");
			Statement stmt=con.createStatement();
//			String query1="CREATE TABLE STUDENT("
//					+"STUD_ID VARCHAR(6) PRIMARY KEY,"
//					+"STUD_NAME VARCHAR(20) NOT NULL,"
//					+"ADDRESS VARCHAR(30) NOT NULL,"
//					+"BRANCH VARCHAR(10) NOT NULL)";
//			stmt.execute(query1);
//			System.out.println("Table created");
			
//			String query1="INSERT INTO STUDENT VALUES('ST101','JOHN','BRAZIL','CS')";;
//			stmt.execute(query1);
			PreparedStatement stmt1=con.prepareStatement("Select * from student where stud_id=?");
			stmt1.setString(1, "ST101");
			stmt1.setString(2, "PETER");
			stmt1.setString(3, "MUMBAI");
			stmt1.setString(4, "EC");
			
			String studName=null;
			String query11="{? = call STUD_DETAIL(?)}";
			CallableStatement cs=con.prepareCall(query11);
			cs.registerOutParameter(1, Types.VARCHAR);
			cs.setString(2, "ST102");
			cs.execute();
			System.out.println("Student Name: "+ cs.getString(1));
			StudentData stud=new StudentData();

			int count=stmt.executeUpdate();
			
			System.out.println(count+" rows inserted..");
			ResultSet rs=stmt.executeQuery();
			{
				System.out.println("Student: "+rs.getString(2));
			}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}

}

