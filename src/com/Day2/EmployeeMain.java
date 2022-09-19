package com.Day2;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		SortEmployee[] EmpArr=new SortEmployee[3];
		for(int i=0;i<EmpArr.length;i++)
		{
			System.out.println("Enter Details of Employee(name,Id,experience)");
			EmpArr[i]=new SortEmployee(s1.next(),s1.nextInt(),s1.nextInt());
		}
		
		for(int i=0;i<EmpArr.length;i++)
		{
			for(int j=i+1;j<EmpArr.length;j++)
			{
				if(EmpArr[i].getExperi()<EmpArr[j].getExperi())
				{
					SortEmployee e=EmpArr[j];
					EmpArr[j]=EmpArr[i];
					EmpArr[i]=e;
					
				}
			}
		}
		for(int i=0;i<EmpArr.length;i++)
		{
			System.out.println(EmpArr[i]);
		}
      s1.close();
	}
	}
