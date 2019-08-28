package cn.sxt.vo;

public class User {

	private int id;
	private String name;
	private String dept;
	private String website;
	private String phone;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public User(int id, String name, String dept, String website, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.website = website;
		this.phone = phone;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dept=" + dept + ", website=" + website + ", phone=" + phone
				+ "]";
	}
	
}
