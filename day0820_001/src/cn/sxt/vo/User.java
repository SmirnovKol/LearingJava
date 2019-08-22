package cn.sxt.vo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {

	public User() {
		// TODO Auto-generated constructor stub
		System.out.println("User constructor");
	}
	private String id;
	private String name;
	private int age;
	private String[] books;
	private List<String> hobbies;
	private Map<String, String> cards;
	private Set<String> games;
	private String wife;
	private Properties info;
	
	
	public Properties getInfo() {
		return info;
	}
	public void setInfo(Properties info) {
		this.info = info;
	}
	public String getWife() {
		return wife;
	}
	public void setWife(String wife) {
		this.wife = wife;
	}
	public Set<String> getGames() {
		return games;
	}
	public void setGames(Set<String> games) {
		this.games = games;
	}
	public Map<String, String> getCards() {
		return cards;
	}
	public void setCards(Map<String, String> cards) {
		this.cards = cards;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
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
	public String[] getBooks() {
		return books;
	}
	public void setBooks(String[] books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", books=" + Arrays.toString(books) + ", hobbies="
				+ hobbies + ", cards=" + cards + ", games=" + games + ", wife=" + wife + ", info=" + info + "]";
	}
	
	
}
