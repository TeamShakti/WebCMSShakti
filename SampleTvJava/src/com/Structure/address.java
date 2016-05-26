package com.Structure;

import javax.xml.bind.annotation.XmlElement;

public class address {
	private double houseno;
	private String street;
	private String city;
	private String region;
	private String country;
	private double pincode;
	@XmlElement
	public double getHouseno() {
		return houseno;
	}
	public void setHouseno(double houseno) {
		this.houseno = houseno;
	}
	@XmlElement
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@XmlElement
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@XmlElement
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@XmlElement
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@XmlElement
	public double getPincode() {
		return pincode;
	}
	public void setPincode(double pincode) {
		this.pincode = pincode;
	}
	
	
	
	
}
