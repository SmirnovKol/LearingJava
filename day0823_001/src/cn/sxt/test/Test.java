package cn.sxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.service.UserService;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.addUser(23);
		userService.addUser(17);
		userService.deleteUser();
	}
}
