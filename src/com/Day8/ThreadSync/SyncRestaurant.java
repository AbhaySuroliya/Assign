package com.Day8.ThreadSync;

public class SyncRestaurant{
	boolean bol=false;
	synchronized void order_status()
    {
    	if(!bol)
    	{
    		System.out.println("Food's getting prepared");
    		try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    		System.out.println("Food's ready");
    }
	synchronized void prepare()
	{
	   System.out.println("Cooking....");
	   bol=true;
	   notify();
	}
}
