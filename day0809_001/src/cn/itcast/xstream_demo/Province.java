package cn.itcast.xstream_demo;

import java.util.ArrayList;
import java.util.List;

public class Province {
	private String name;
	private List<City> cities = new ArrayList<City>();
	public Province() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Province(String name, List<City> cities) {
		super();
		this.name = name;
		this.cities = cities;
	}
	@Override
	public String toString() {
		return "Province [name=" + name + ", cities=" + cities + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	public void addCity(City city) {
		cities.add(city);
	}
}
