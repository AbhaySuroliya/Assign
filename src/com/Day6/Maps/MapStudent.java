package com.Day6.Maps;

public class MapStudent {
	private String name;
	private int studid;
	private String dept;
	public MapStudent(String name, int studid, String dept) {
		super();
		this.name = name;
		this.studid = studid;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "MapStudent [name=" + name + ", studid=" + studid + ", dept=" + dept + "]";
	}
	
	
}
