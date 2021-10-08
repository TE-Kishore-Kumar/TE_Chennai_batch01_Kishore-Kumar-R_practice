package com.te.collectionimpl.listimpl;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student> {

	private int id;

	private String name;

	public Student() {

	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student std) {
		// return this.getId() - std.getId(); // asc
		return std.getId() - this.getId(); //des
		//return this.getName().compareTo(std.getName());
		// return 0;
	}
}
