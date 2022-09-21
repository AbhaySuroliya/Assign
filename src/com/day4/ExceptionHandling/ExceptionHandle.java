package com.day4.ExceptionHandling;
import java.util.Scanner;
import java.util.*;
public class ExceptionHandle {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		try 
		{
			System.out.println("Enter Number of Items");
			int x=scan.nextInt();
	    	int arr[]=new int[x];
	    	System.out.println("Enter Price details");
			for(int i=0;i<x;i++)
			{
				arr[i]=scan.nextInt();
			}
			System.out.println("Enter Index to search Item details");
			try {
				int n=scan.nextInt();
				System.out.println("The Price of the Item is: "+arr[n]);
			}
			catch(Exception e) {
				System.out.println("Please Enter valid Index! ");
			}
		}
		catch(Exception ex) {
			System.out.println("Please Enter Integer type!");
		}
	}
}

