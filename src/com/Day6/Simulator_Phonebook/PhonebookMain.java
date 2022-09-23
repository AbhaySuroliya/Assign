package com.Day6.Simulator_Phonebook;

import java.util.Scanner;
import com.Day6.Simulator_Phonebook.Simulator_Operations;

public class PhonebookMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 try{
			 Simulator_Operations op=new Simulator_Operations();
				while(true)
				{
				System.out.println("Welcome to PhoneBook");
				System.out.println("1.Add Contact");
				System.out.println("2.View Contact");
				System.out.println("3.Search Contact by name");
				System.out.println("4.Search Contact by number");
				System.out.println("5.delete contact");
				System.out.println("6.Exit");
			    int n=sc.nextInt();
			    if(n==1)
			     {
			       try {
			    	   System.out.println("Enter name");
			    	   String s=sc.next();
			    	   System.out.println("Enter Contact No.");
			    	   String con=sc.next();
			    	   if(op.validate(con))
			    		   op.add(s,con);
			    	   else {
			    		   throw new Validate("Enter a valid Number");
			    	   }
			       }
			       catch(Exception e)
			       {
			    	   e.printStackTrace();
			       }
			     }
			    else if(n==2)
			     {
			    	op.display();
			     }
			    else if(n==3)
			    {
			    	try {
			    		System.out.println("Enter Search name");
			    		String s=sc.next();
			    		op.searchByName(s);
			    	}
			    	catch(Exception e)
			    	{
			    		e.printStackTrace();
			    	}
			    }
			    else if(n==4)
			    {
			    	try {
			    		System.out.println("Enter Search number");
			    		String s=sc.next();
			    		op.searchByNumber(s);
			    	}
			    	catch(Exception e)
			    	{
			    		e.printStackTrace();
			    	}
			    }
			    else if(n==5)
			    {
			    	System.out.println("Enter number to delete");
			    	String con=sc.next();
			    	op.delete(con);
			    }
			    else 
			    {
			    	break;
			    }
	            }
			}
		    catch(Exception e){
		    	e.printStackTrace();
		     }

	}

}
