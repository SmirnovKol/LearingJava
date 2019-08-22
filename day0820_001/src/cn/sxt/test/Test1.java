package cn.sxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.service.impl.UserServiceImpl;
import cn.sxt.vo.User;
import cn.sxt.vo.User2;
import cn.sxt.vo.User3;

public class Test1 {

	public static void main(String[] args) {
//		@SuppressWarnings("resource")
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//		Hello hello = (Hello) applicationContext.getBean("hello");
//		hello.show();
//		System.out.println(hello);
		
//		@SuppressWarnings("resource")
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//		User user = (User) applicationContext.getBean("user");
//		System.out.println(user);
//		
//		User2 user2 = (User2) applicationContext.getBean("user2");
//		System.out.println(user2);
		
//		@SuppressWarnings("resource")
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//		User user = (User) applicationContext.getBean("user");
//		System.out.println(user);
		
//		@SuppressWarnings("resource")
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//		User3 user3 = (User3) applicationContext.getBean("user3");
//		System.out.println(user3);
		
//		@SuppressWarnings("resource")
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//		User3 user3 = (User3) applicationContext.getBean("user4");
//		System.out.println(user3);
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("service");
		userServiceImpl.getUser();
	}
}
