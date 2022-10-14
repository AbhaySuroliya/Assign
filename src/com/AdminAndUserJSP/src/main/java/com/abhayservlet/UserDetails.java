package com.abhayservlet;

public class UserDetails {
		String name;
		String type;
	   String add;
	   String email;
	   int age;
	   String pass;
	public UserDetails(String name, String type, String add, String email, int age, String pass) {
		super();
		this.name = name;
		this.type = type;
		this.add = add;
		this.email = email;
		this.age = age;
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	   
}