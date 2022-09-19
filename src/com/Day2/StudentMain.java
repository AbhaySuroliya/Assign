package com.Day2;

public class StudentMain {

	public static void main(String[] args) {
		StudentConstructor s1= new StudentConstructor("Veena",20,1,29);
		StudentConstructor s2= new StudentConstructor("Patik",21,2,34);
		StudentConstructor s3= new StudentConstructor("Laura",21,3,20);
		StudentConstructor s4= new StudentConstructor("Bharat",20,4,30);
		StudentConstructor s5= new StudentConstructor("Sruti",21,5,54);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println(s5.toString());
		
	}

}
