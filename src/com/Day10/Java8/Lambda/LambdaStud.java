package com.Day10.Java8.Lambda;

public class LambdaStud {
	private String studname;
	private int age;
	public LambdaStud(String studname, int age) {
		super();
		this.studname = studname;
		this.age = age;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "LambdaStud [studname=" + studname + ", age=" + age + "]";
	}
	
}
