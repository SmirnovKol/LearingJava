package cn.sxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.service.UserService;
import cn.sxt.service.impl.UserServiceImpl;

public class Test2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		UserService userService = (UserServiceImpl) applicationContext.getBean("userService");
		userService.getUser();
	}
}
