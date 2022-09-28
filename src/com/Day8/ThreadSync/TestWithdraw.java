package com.Day8.ThreadSync;

public class TestWithdraw {

	public static void main(String[] args) {
		ThreadWithdraw obj=new ThreadWithdraw();
        WithdrawThread t1=new WithdrawThread(1000,obj);
        WithdrawThread t2=new WithdrawThread(2000,obj);
        WithdrawThread t3=new WithdrawThread(4000,obj);
        WithdrawThread t4=new WithdrawThread(3000,obj);
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
