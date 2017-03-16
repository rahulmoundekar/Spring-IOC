package com;

public class Employee {

	public Employee(String empname,Address address) {
	System.out.println("Employee instance is created ");
	this.address=address;
	this.empname=empname;
	}
private String empname;
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
private Address address;
	
	
}
