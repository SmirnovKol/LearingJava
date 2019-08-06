package cn.itcast.domain;
/**
 *@Title User.java
 *@description TODO
 *@time Aug 6, 2019 10:09:19 PM
 *@author kol
 *@version 1.0
 */
public class Person {
	private String name;
	private int age;
	private String gender;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
