package com.Day8.WithandWithoutSync;

public class Sync extends Thread {
	WithandWithout sy;  
	public Sync(WithandWithout sy)
      {
    	  this.sy=sy;
      }
	@Override
	public void run() {
        try {
			sy.printWithSyn(500);
			sy.printWithSyn(200);
			sy.printWithSyn(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
	}
}
