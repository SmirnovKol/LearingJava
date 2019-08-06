package cn.itcast.domain;
/**
 *@Title Employee.java
 *@description TODO
 *@time Aug 6, 2019 11:17:34 PM
 *@author kol
 *@version 1.0
 */
public class Employee {
	private String name;
	private Address address;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getHi() {
		return "Employee.getHi()";
	}
}
