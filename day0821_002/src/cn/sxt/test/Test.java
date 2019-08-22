package cn.sxt.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import cn.sxt.dynamicproxy.Host;
import cn.sxt.dynamicproxy.ProxyInvocationHandler;
import cn.sxt.dynamicproxy.Rent;

public class Test {

	public static void main(String[] args) {
		Host host = new Host();
		ProxyInvocationHandler pih = new ProxyInvocationHandler(host);
//		Rent proxy = (Rent) pih.getProxy();
//		proxy.rent();
		
		Rent proxy = (Rent) Proxy.newProxyInstance(pih.getClass().getClassLoader(),
				host.getClass().getInterfaces(), pih);
		System.out.println(proxy.rent());
	}
}
