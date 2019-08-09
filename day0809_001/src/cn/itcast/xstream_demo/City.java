package cn.itcast.xstream_demo;

public class City {
	private String name;
	private int age;
	private String description;
	public City(String name, int age, String description) {
		super();
		this.name = name;
		this.age = age;
		this.description = description;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", age=" + age + ", description=" + description + "]";
	}
	
}
