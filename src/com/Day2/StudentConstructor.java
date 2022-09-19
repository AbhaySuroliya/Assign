package com.Day2;

public class StudentConstructor {
	private String name;
	private int age;
	private int rollno;
	private int marks;
public StudentConstructor(String name, int age, int rollno, int marks)
{
	if(marks>=30)
	{
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		this.marks=marks;
		
	}
	else
	{
		System.out.println("Marks less than 30 not accepted");
	}
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", rollno=" + rollno + ", marks=" + marks + "]";
}
}
