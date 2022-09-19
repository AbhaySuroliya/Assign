package com.Day3.BankProject;

public class BankMain {

	public static void main(String[] args) {
		Acc a=new SavingAcc(1000, 5);
        System.out.println(a.rateOfInterest());
	}

	}
