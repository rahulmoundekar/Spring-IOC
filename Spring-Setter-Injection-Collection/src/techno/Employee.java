package techno;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private Company company;
	private String  empname;
	private int empid;
	private List<String> techKnown;
	private Set<Integer> salary;
	private Map info;

public Map getInfo() {
		return info;
	}

	public void setInfo(Map info) {
		this.info = info;
	}

public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public List getTechKnown() {
		return techKnown;
	}

	public void setTechKnown(List techKnown) {
		this.techKnown = techKnown;
	}


	
	public Set<Integer> getSalary() {
	return salary;
}

public void setSalary(Set<Integer> salary) {
	this.salary = salary;
}

	public Employee() {
		System.out.println("Employee---Constructor");
	}

}
