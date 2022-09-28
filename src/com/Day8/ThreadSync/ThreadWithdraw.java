package com.Day8.ThreadSync;

public class ThreadWithdraw throws CusExcep{
	 int p=10000;
	    synchronized void shareMethod(int arg)
	    {
	        if(arg<=p)
	        {
	            p=p-arg;
	            System.out.println("Withdraw Amount: "+ arg);
	            System.out.println(" Remaining Amount: "+ p);
	        }
	        else if(arg>p)
	        {
	            throw new CusExcep("Not Enough money");
	        }
	            try
	            {    
	                Thread.sleep(1000);
	            }
	            catch(InterruptedException e)
	            {
	                System.out.println("Thread Interrupted: ");
	            }
	            
	    }
}
