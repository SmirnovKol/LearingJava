package cn.sxt.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WorkHandler implements InvocationHandler {

	private Object obj;
	
	
	public WorkHandler(Object obj) {
		super();
		this.obj = obj;
	}


	public WorkHandler() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before invoke...");
		Object result = method.invoke(obj, args);
		System.out.println("after invoke...");
		return result;
	}

}
