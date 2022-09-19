package com.Day3.BankProject;

public class AccCheck extends Acc{
	public AccCheck(int x,int y)
	{
		super.setX(x);
		super.setY(y);
	}
	@Override
	public int rateOfInterest() {
		
		return (4*super.getX()*super.getY())/100;
	}
}