package com.Day8.WithandWithoutSync;

public class WithandWithout {
	int balance;
	WithandWithout(int balance)
	{
		this.balance=balance;
	}
  synchronized public void printWithSyn(int balance) throws InterruptedException {
	   System.out.println("Withdraw balance (Sync) "+balance+"Remaining is "+(this.balance-balance));
	   Thread.sleep(2000);
   }
   public void printWithoutSyn(int balance) throws InterruptedException
   {
	   System.out.println("Withdraw balance (Without Sync) "+balance+"Remaining is "+(this.balance-balance));
	   Thread.sleep(2000);
   }
}
