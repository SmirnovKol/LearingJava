package cn.sxt.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import cn.sxt.dynamicproxy.People;
import cn.sxt.dynamicproxy.Teacher;
import cn.sxt.dynamicproxy.WorkHandler;

public class Test {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		InvocationHandler handler = new WorkHandler(teacher);
		People proxy = (People) Proxy.newProxyInstance(teacher.getClass().getClassLoader(), teacher.getClass().getInterfaces(), handler);
		String result = proxy.work();
		System.out.println(result);
	}
}
