package cn.sxt.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

	private Rent rent;
	
	public ProxyInvocationHandler() {
		// TODO Auto-generated constructor stub
	}
	
	public ProxyInvocationHandler(Rent rent) {
		super();
		this.rent = rent;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		beforeInvoke();
		Object result = method.invoke(rent, args);
		afterInvoke();
		return result;
	}
	
	public Object getProxy() {
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), 
				rent.getClass().getInterfaces(), this);
	}
	
	private void beforeInvoke() {
		System.out.println("before invoke...");
	}

	private void afterInvoke() {
		System.out.println("after invoke...");
	}
}
