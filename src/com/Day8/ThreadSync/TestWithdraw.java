package com.Day8.ThreadSync;

public class TestWithdraw {

	public static void main(String[] args) {
		ThreadWithdraw obj=new ThreadWithdraw();
		SyncRunn t1=new SyncRunn(1000,obj);
		SyncRunn t2=new SyncRunn(2000,obj);
		SyncRunn t3=new SyncRunn(4000,obj);
		SyncRunn t4=new SyncRunn(3000,obj);
        try
        {
            t1.t.join();
            t2.t.join();
            t3.t.join();
            t4.t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread Interrupted: ");
        }

	}

}
