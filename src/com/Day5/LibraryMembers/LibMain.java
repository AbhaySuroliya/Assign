package com.Day5.LibraryMembers;
import java.util.Scanner;

public class LibMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
    	System.out.println("Welcome to My Library");
    	LibArray op=new LibArray();
    	 while(true) {
    	System.out.println("1.Enter a member");
    	System.out.println("2.View Members");
    	System.out.println("3.View Member by address");
    	System.out.println("4.Exit");
    	 int n=scan.nextInt();
    	  if(n==1)
    	  { 
    		  System.out.println("Enter a member name");
    		  String s=scan.next();
    		  System.out.println("Enter id");
    		  String id=scan.next();
    		  System.out.println("Enter address");
    		  String ad=scan.next();
    		  op.add(s,id,ad);
    	  }
    	  else if(n==2)
    	  {
    		  op.display();
    	  }
    	  else if(n==3)
    	  {
    		  System.out.println("Enter a address");
    		  String add=scan.next();
    		  op.address(add);
    	  }
    	  else
    	  {
    		  break;
    	  }
    	 }
    	 System.out.println("Thank you!");

	}

}
