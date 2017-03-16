package techno;

public class Company {
private String companyname;
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public String getCompanyaddress() {
	return companyaddress;
}
public void setCompanyaddress(String companyaddress) {
	this.companyaddress = companyaddress;
}
private String companyaddress;
	public Company() {
		System.out.println("Company----constructor");
		
	}

	
}
