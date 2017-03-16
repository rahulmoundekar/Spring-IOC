package techno;

public class Address {

	private String areaname;
	private String cityname;
	public Address(String areaname,String cityname) {
		this.areaname=areaname;
		this.cityname=cityname;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return areaname+" "+cityname;
	}
	

}
