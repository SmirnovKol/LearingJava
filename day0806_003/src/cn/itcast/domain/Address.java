package cn.itcast.domain;
/**
 *@Title Address.java
 *@description TODO
 *@time Aug 6, 2019 11:17:49 PM
 *@author kol
 *@version 1.0
 */
public class Address {
	private String city;
	private String street;
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHi() {
		// TODO Auto-generated method stub
		return "Address.getHi();";
	}
}
