package com.springboot.LastAssignment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name="Products")
public class Products {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String decs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDecs() {
		return decs;
	}

	public void setDecs(String decs) {
		this.decs = decs;
	}

	public Products(int id, String name, String decs) {
		super();
		this.id = id;
		this.name = name;
		this.decs = decs;
	}
	
}
