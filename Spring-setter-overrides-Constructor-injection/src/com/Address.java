package com;

public class Address {

	public Address(String cityname) {
		
	System.out.println("Address instance is created");
	this.cityname=cityname;
	}
	
	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	private String cityname;

}
