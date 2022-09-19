package com.Day2;

public class SortEmployee {
	String name;
	int empId;
	int experi;

	public SortEmployee(String name,int empId,int exp) {
		this.name=name;
		this.empId=empId;
		this.experi=exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getExperi() {
		return experi;
	}

	public void setExperi(int experi) {
		this.experi = experi;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", empId=" + empId + ", experi=" + experi + "]";
	}
}
