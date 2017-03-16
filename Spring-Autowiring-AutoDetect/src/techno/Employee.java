package techno;

public class Employee {

	/*public Employee(Address address) {
		this.address=address;
	}*/
private Address address;
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpid() {
	return empid;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
private String empname;
private String empid;

	
}
