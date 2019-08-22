package cn.sxt.vo;

public class User3 {

	private String id;
	private String name;
	private int age;
	
	
	public User3(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		System.out.println("User3(String id, String name, int age)");
	}
	public User3() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("User3()");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "User3 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
