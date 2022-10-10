package com.abhayservlet;

public class Student {
	   String name;
	   String pass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Student(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", pass=" + pass + "]";
	}
	   
	}
