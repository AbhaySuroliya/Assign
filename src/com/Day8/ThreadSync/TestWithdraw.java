package com.Day8.ThreadSync;

public class TestWithdraw {

	public static void main(String[] args) {
		SyncRestaurant stat=new SyncRestaurant();
		   new Thread() {
			   public void run()
			   {
				   stat.order_status();
			   }
		   }.start();
		   new Thread() {
			   public void run() {
				   stat.prepare();
			   }
		   }.start();

	}

}
