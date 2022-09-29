package com.Day10.Java8.Stream;

public class StreamStud {
	private String name;
	private int id;
	private String colgName;
	public StreamStud(String name, int id, String colgName) {
		super();
		this.name = name;
		this.id = id;
		this.colgName = colgName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColgName() {
		return colgName;
	}
	public void setColgName(String colgName) {
		this.colgName = colgName;
	}
	@Override
	public String toString() {
		return "SearchWithCollege [name=" + name + ", id=" + id + ", colgName=" + colgName + "]";
	}
}
