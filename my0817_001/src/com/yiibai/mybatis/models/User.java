package com.yiibai.mybatis.models;

public class User {

	private int id;
	private String name;
	private String sex;
	private int age;
	private String tel;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String sex, int age, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", tel=" + tel + "]";
	}
	
}
