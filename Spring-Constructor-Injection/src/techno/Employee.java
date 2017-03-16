package techno;

import java.util.List;
import java.util.Set;

public class Employee {
private String empname;
private int empid;
private Address address;


	public Employee(int empid,String empname,Address address) 
	{
	
		this.empid=empid;
		this.empname=empname;
		this.address=address;
	
	}

	@Override
		public String toString() 
		{
			return empid+" "+empname+" "+address;
		}
}
