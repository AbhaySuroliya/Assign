package com.Day3;

public class OverloadedMethod {
	public int sum(int p,int q) {
	      return p+q;
	      }
	      public int sum(int p,int q,int r)
	      {
	    	  return p+q+r;
	      }
	      public int sum(int p,int q,int r,int s)
	      {
	    	  return p+q+r+s;
	      }
	      public void  average(int a,int b)
	      {
	    	  System.out.println("Sum :"+sum(a,b));
	    	  System.out.println("Avg :"+sum(a,b)/2);
	      }
	      public void average(int a,int b,int c)
	      {
	    	  System.out.println("Sum :"+sum(a,b,c));
	    	  System.out.println("Avg :"+sum(a,b,c)/2);
	      }
	      public void average(int a,int b,int c,int d)
	      {
	    	  System.out.println("Sum :"+sum(a,b,c,d));
	    	  System.out.println("Avg :"+sum(a,b,c,d)/2);
	      }
		public static void main(String[] args) {
			OverloadedMethod check=new OverloadedMethod();
			check.average(10, 20);
			check.average(10, 20,30);
		}
}
