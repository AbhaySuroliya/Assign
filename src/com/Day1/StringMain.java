package com.Day1;
import java.util.Scanner;
public class StringMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]=new int[26];
		 System.out.println("Enter String");
         String sen=scan.next();
        
         for(int i=0;i<sen.length();i++)
         {
        	 a[sen.charAt(i)-'a']++;
         }
         String r="";
         for(int i=0;i<sen.length();i++)
         {
        	 if(a[sen.charAt(i)-'a']==0)
        		 continue;
        	 else {
        	 r=r+sen.charAt(i)+(a[sen.charAt(i)-'a']);
        	 a[sen.charAt(i)-'a']=0;
        	 }
         }
         System.out.println(r);
	}

}

