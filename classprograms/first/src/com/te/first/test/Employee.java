package com.te.first.test;

public class Employee implements Cloneable {
	
	private int eid;
	
	private String ename;
	
	private double salary;
	private String role;
	
	@Override
	public int hashCode() {
		return this.eid;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
		public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}
	
	@Override
	public String toString() {
		return "Employee [eid="+eid+", ename="+ename+", salary="+salary+", role="+role+"]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
