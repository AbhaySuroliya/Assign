package com.Day8.WithandWithoutSync;

public class WithoutSync extends Thread {
	WithandWithout sy;  
	public WithoutSync(WithandWithout sy)
      {
    	  this.sy=sy;
      }
	@Override
	public void run() {
        try {
			sy.printWithoutSyn(400);
			sy.printWithoutSyn(100);
			sy.printWithoutSyn(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
	}
}
