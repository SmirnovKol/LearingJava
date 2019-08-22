package cn.sxt.test;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import cn.sxt.dynamicproxy.ProxyInvocationHandler;
import cn.sxt.service.UserService;
import cn.sxt.service.impl.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
//		UserServiceImpl userServiceImpl = new UserServiceImpl();
//		ProxyInvocationHandler pih = new ProxyInvocationHandler(userServiceImpl);
//		UserService proxy = (UserService) Proxy.newProxyInstance(pih.getClass().getClassLoader(),
//				userServiceImpl.getClass().getInterfaces(), pih);
//		proxy.addUser();
		
//		UserService proxy = (UserService) pih.getProxy();
//		proxy.deleteUser();
		
		ProxyInvocationHandler pih = new ProxyInvocationHandler(new ArrayList<String>());
		@SuppressWarnings("unchecked")
		List<String> proxy = (List<String>) pih.getProxy();
		proxy.add("hello");
		proxy.add("python");
		System.out.println(proxy);
	}
}
