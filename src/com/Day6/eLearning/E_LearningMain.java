package com.Day6.eLearning;

import java.util.Scanner;

public class E_LearningMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
			DeclareArray op=new DeclareArray();
			while(true)
			{
			System.out.println("--------eLearning Portal---------");
			System.out.println("1.Add Student");
			System.out.println("2.Add Course");
			System.out.println("3.View Courses");
			System.out.println("4.Enroll Student to a course");
			System.out.println("5.View enrolled Students");
			System.out.println("6.Exit");
			System.out.println("---------------------------------");
		    int c=scan.nextInt();
		    
		    if(c==1)
		    {
		    	try {
		    		System.out.println("Enter Student Name");
		    		String name=scan.next();
		    		System.out.println("Enter Student id");
		    		int id=scan.nextInt();
		    		System.out.println("Enter Trainer Name");
		    		String dep=scan.next();
		    		op.addStudent(name,id,dep);
		    		System.out.println("Student added Successfully!!");
		    	}
		    	catch(Exception exp1)
		    	{
		    		System.out.println("Please Enter valid input");
		    	}
		    }
		    else if(c==2)
		    {
		    	try {
		    	System.out.println("Enter Course id");
		    	int id=scan.nextInt();
		    	System.out.println("Enter Course name");
		    	String s=scan.next();
		    	System.out.println("Enter desciption");
		    	scan.nextLine();
		    	String dep=scan.nextLine();
		    	op.addCourse(id,s,dep);
		    	System.out.println("Course added Successfully!!");
		    	}
		    	catch(Exception exp2)
		    	{
		    		System.out.println("Please Enter valid input");
		    	}
		    }
		    else if(c==3)
		    {
		    	op.displayCourse();
		    }
		    else if(c==4)
		    {
		    	try {
		    		System.out.println("Enter Student id");
		    		int id=scan.nextInt();
		    		System.out.println("Enter Course id");
		    		int cid=scan.nextInt();
		    		op.enrolls(id,cid);
		    	}
		    	catch(Exception exp3) {
		    	  exp3.printStackTrace();
		         }
		    }
		    else if(c==5)
		    {
		    	try {
		    		System.out.println("Enter course id");
		    		int id=scan.nextInt();
		    		op.displayCourse(id);
		    	}
		    	catch(Exception exp4)
		    	{
		    		exp4.printStackTrace();
		    	}
		    }
		    else {
		    	break;
		    }
		  }
			System.out.println("Thank You!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
