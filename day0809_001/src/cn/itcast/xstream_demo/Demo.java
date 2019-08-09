package cn.itcast.xstream_demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.thoughtworks.xstream.XStream;

public class Demo {
	public List<Province> getProvinceList() {
		List<Province> provinceList = new ArrayList<Province>();
		
		Province province = new Province();
		province.setName("四川省");
		province.addCity(new City("成都市", 2000, "chengdu"));
		province.addCity(new City("乐山市", 1900, "leshan"));
		provinceList.add(province);
		
		Province province2 = new Province();
		province2.setName("湖北省");
		province2.addCity(new City("武汉市", 2000, "wuhan"));
		province2.addCity(new City("襄阳市", 1900, "xiangyang"));
		provinceList.add(province2);
		
		return provinceList;
		
	}

	@Test
	public void fun1() {
		List<Province> provinceList = getProvinceList();
		XStream xStream = new XStream();
		String xmlString = xStream.toXML(provinceList);
		System.out.println(xmlString);
	}
	
	@Test
	public void fun2() {
		List<Province> provinceList = getProvinceList();
		XStream xStream = new XStream();
		xStream.alias("province", Province.class);
		xStream.alias("city", City.class);
		xStream.alias("china", List.class);
		String xmlString = xStream.toXML(provinceList);
		System.out.println(xmlString);
	}
	
	@Test
	public void fun3() {
		List<Province> provinceList = getProvinceList();
		XStream xStream = new XStream();
		xStream.alias("province", Province.class);
		xStream.alias("city", City.class);
		xStream.alias("china", List.class);
		xStream.useAttributeFor(Province.class, "name");
		xStream.addImplicitCollection(Province.class, "cities");
		xStream.omitField(City.class, "description");
		String xmlString = xStream.toXML(provinceList);
		System.out.println(xmlString);
	}
}
