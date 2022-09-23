package com.Day6.Simulator_Phonebook;

public class Phonebook {
	private String name;
	private String contact;
	public Phonebook(String name, String contact) {
		super();
		this.name = name;
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Phonebook [name=" + name + ", contact=" + contact + "]";
	}
	
}
