package com.Day5.LibraryMembers;

public class LibData {
	private String name;
	private String id;
    private String Address;
    public LibData(String name, String id, String address) {
		super();
		this.name = name;
		this.id = id;
		Address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "LibData [name=" + name + ", id=" + id + ", Address=" + Address + "]";
	}
	
}
