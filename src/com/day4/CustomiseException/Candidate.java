package com.day4.CustomiseException;

public class Candidate {
	private String name;
	private String gender;
	private int expectedSalary;

	public Candidate(String name, String gender, int expectedSalary) {
		super();
		this.name = name;
		this.gender = gender;
		this.expectedSalary = expectedSalary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(int expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", gender=" + gender + ", expectedSalary=" + expectedSalary + "]";
	}
	
}
