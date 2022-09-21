package com.day4.CustomiseException;
import java.util.*;
public class UserExceptionMain {

	public static void main(String[] args) throws ShowException {
		Scanner scan= new Scanner(System.in);
		try {
		System.out.println("Enter Candidate details");
		String name=scan.next();
		String gender=scan.next();
		int salary=scan.nextInt();
		if(salary>=10000)
		{
			Candidate can = new Candidate(name,gender,salary);
			System.out.println(can.toString());
		}
		else 
		{
			throw new ShowException("Salary should be more than 10000!");
			
		}
		}
		catch(ShowException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Program ended successfully!");	
		}
			
}
