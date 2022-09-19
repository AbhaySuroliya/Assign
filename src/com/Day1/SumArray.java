package com.Day1;

public class SumArray {

	public static void main(String[] args) {
		int arr[]= new int[6];
		
		//System.out.println(arr.length);
		arr[0]=3;
		arr[1]=10;
		arr[2]=20;
		arr[3]=30;
		arr[4]=40;
		arr[5]=50;
		
		int sum=0;
		for (int i=0;i<(arr.length);i++)
		{
			sum= arr[i]+sum;
		}

		System.out.println(sum);
	}
}
