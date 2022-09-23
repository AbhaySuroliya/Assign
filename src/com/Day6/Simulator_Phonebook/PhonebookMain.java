package com.Day6.Simulator_Phonebook;

import java.util.Scanner;
import com.Day6.Simulator_Phonebook.Simulator_Operations;

public class PhonebookMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 try{
			 Simulator_Operations opera=new Simulator_Operations();
				while(true)
				{
				System.out.println("---------PhoneBook Simulator---------");
				System.out.println("Please select Operation from below menu");
				System.out.println("1.Add Contact");
				System.out.println("2.View Contact");
				System.out.println("3.Search Contact by name");
				System.out.println("4.Search Contact by number");
				System.out.println("5.Delete contact");
				System.out.println("6.Exit");
			    int c=scan.nextInt();
			    if(c==1)
			     {
			       try {
			    	   System.out.println("Enter name");
			    	   String s=scan.next();
			    	   System.out.println("Enter Contact No.");
			    	   String con=scan.next();
			    	   if(opera.validate(con))
			    		   opera.addContact(s,con);
			    	   else {
			    		   throw new Validate("Enter a valid Number");
			    	   }
			       }
			       catch(Exception exp1)
			       {
			    	   exp1.printStackTrace();
			       }
			     }
			    else if(c==2)
			     {
			    	opera.displayContact();
			     }
			    else if(c==3)
			    {
			    	try {
			    		System.out.println("Enter Search name");
			    		String s=scan.next();
			    		opera.searchByName(s);
			    	}
			    	catch(Exception exp2)
			    	{
			    		exp2.printStackTrace();
			    	}
			    }
			    else if(c==4)
			    {
			    	try {
			    		System.out.println("Enter Search number");
			    		String s=scan.next();
			    		opera.searchByContact(s);
			    	}
			    	catch(Exception exp3)
			    	{
			    		exp3.printStackTrace();
			    	}
			    }
			    else if(c==5)
			    {
			    	System.out.println("Enter number to delete");
			    	String con=scan.next();
			    	opera.delete(con);
			    }
			    else 
			    {
			    	break;
			    }
	            }
				System.out.println("Thank You!!");
			}
		    catch(Exception e){
		    	e.printStackTrace();
		     }

	}

}
