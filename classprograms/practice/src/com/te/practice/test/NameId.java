package com.te.practice.test;

public class NameId {

	private int id;
	private String name;
	
	@Override
	public String toString() {
		
		return this.name;
	}
	
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
	
	
}
