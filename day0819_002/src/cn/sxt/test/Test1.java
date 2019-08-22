package cn.sxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.bean.Hello;

public class Test1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Hello hello = (Hello) applicationContext.getBean("hello");
		hello.show();
		System.out.println(hello);
		
	}
}
