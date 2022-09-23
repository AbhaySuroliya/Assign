package com.Day6.eLearning;

public class StudentDetails {
	private String name;
	private int id;
	private String trainer;
	public StudentDetails(String name, int id, String trainer) {
		super();
		this.name = name;
		this.id = id;
		this.trainer = trainer;
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
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", id=" + id + ", trainer=" + trainer + "]";
	}
	
}
