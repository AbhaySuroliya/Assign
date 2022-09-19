package com.Day1;
import java.util.Scanner;
public class Matrix {	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter dimention");
    	int x=scan.nextInt();
    	int y=scan.nextInt();
    	int arr[][]=new int[x][y];
    	for(int i=0;i<x;i++)
    	{
    		for(int j=0;j<y;j++)
    		{
    			arr[i][j]=scan.nextInt();
    		}
    	}
    	int i, k = 0, l = 0;
      while (k < y && l < x) {
            for (i = l; i < x; ++i) {
                System.out.print(arr[k][i] + " ");
            }
            k++;
            for (i = k; i < y; ++i) {
                System.out.print(arr[i][x - 1] + " ");
            }
            x--;
            if (k < y) {
                for (i = x - 1; i >= l; --i) {
                    System.out.print(arr[y - 1][i] + " ");
                }
                y--;
            }
            if (l < x) {
                for (i = y - 1; i >= k; --i) {
                    System.out.print(arr[i][l] + " ");
                }
                l++;
            }
    }
 }
}
