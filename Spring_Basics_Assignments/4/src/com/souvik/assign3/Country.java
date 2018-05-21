package com.souvik.assign3;

public class Country {
	String CountryID;
	public String getCountryID() {
		return CountryID;
	}
	public void setCountryID(String countryID) {
		CountryID = countryID;
	}
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	String CountryName;
	public Country getC1() {
		return c1;
	}
	public void setC1(Country c1) {
		this.c1 = c1;
	}
	public Country getC2() {
		return c2;
	}
	public void setC2(Country c2) {
		this.c2 = c2;
	}
	Country c1;
	Country c2;
}
