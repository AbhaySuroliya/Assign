package com.Day3.BankProject;

public class SavingAcc extends Acc{
    SavingAcc(int x,int y)
    {
         super.setX(x);
         super.setY(y);
     }
    @Override
	public int rateOfInterest()
   {
	   return (5*super.getX()*super.getY())/100;
   }
}
