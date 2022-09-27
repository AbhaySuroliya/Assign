package com.Day7.Thread;


public class ThreadBasic implements Runnable {
	public ThreadBasic(int r)
	{
		Thread t1=new Thread(this);
		t1.setPriority(r);
		System.out.println("Priority is "+r);
		t1.run();
	}
	@Override
	public void run() {
		System.out.println("Welcome Thread");
	}
}
