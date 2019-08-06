package cn.itcast.domain;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import cn.itcast.utils.CommonUtils;

/**
 *@Title Demo.java
 *@description TODO
 *@time Aug 6, 2019 10:20:25 PM
 *@author kol
 *@version 1.0
 */
public class Demo {

	@Test
	public void fun1() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class<?> clazz = Class.forName("cn.itcast.domain.Person");
		Object bean = clazz.getDeclaredConstructor().newInstance();
		BeanUtils.setProperty(bean, "name", "张三");
		BeanUtils.setProperty(bean, "age", 23);
		BeanUtils.setProperty(bean, "gender", "男");
		
		System.out.println(bean);
		
		System.out.println(BeanUtils.getProperty(bean, "name"));
		System.out.println(BeanUtils.getProperty(bean, "age"));
		System.out.println(BeanUtils.getProperty(bean, "gender"));
	}
	
	@Test
	public void fun2() throws IllegalAccessException, InvocationTargetException {
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", "wangWu");
		map.put("password", "123456");
		User user = new User();
		BeanUtils.populate(user, map);
		System.out.println(user);
 	}
	
	@Test
	public void fun3() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", "wangWu");
		map.put("password", "1256");
		
		User user = CommonUtils.toBean(map, User.class);
		System.out.println(user);
	}
}
