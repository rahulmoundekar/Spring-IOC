package com;

public class Address {
private String areaname;
public String getAreaname() {
	return areaname;
}
public void setAreaname(String areaname) {
	this.areaname = areaname;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
private String City;

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return City+areaname;
	}

}
