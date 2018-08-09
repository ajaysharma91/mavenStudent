package test;


public class Address {
	private String street1;
	private String street2;
	private String city;
	private String area;
	private String state;
	private String country;
	private String pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street1, String street2, String city, String area, String state, String country,
			String pincode) {
		super();
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.area = area;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	
}
