package cn.sxt.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

	private Object obj;
	
	
	public ProxyInvocationHandler(Object obj) {
		super();
		this.obj = obj;
	}


	public ProxyInvocationHandler() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Object getProxy() {
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), 
				obj.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		log(method.getName());
		beforeInvoke();
		Object result = method.invoke(obj, args);
		afterInvoke();
		return result;
	}
	
	private void beforeInvoke() {
		System.out.println("before invoke...");
	}

	private void afterInvoke() {
		System.out.println("after invoke...");
	}
	private void log(String methodName) {
		System.out.println("Ö´ÐÐ" + methodName + "·½·¨");
	}
}
