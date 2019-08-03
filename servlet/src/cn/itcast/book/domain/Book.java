package cn.itcast.book.domain;
/**
 *@Title Book.java
 *@description TODO
 *@time Aug 3, 2019 8:29:44 PM
 *@author kol
 *@version 1.0
 */
public class Book {
	private String name;
	private double price;
	private int category;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	public Book(String name, double price, int category) {

		this.name = name;
		this.price = price;
		this.category = category;
	}
	
}
