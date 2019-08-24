package cn.sxt.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Log {
//
//	@Before("execution(* cn.sxt.service.impl.*.*(..))")
//	public void before() {
//		System.out.println("before...");
//	}
//	
//	@After("execution(* cn.sxt.service.impl.*.*(..))")
//	public void after() {
//		System.out.println("after...");
//	}
	
	@Around("execution(* cn.sxt.service.impl.*.*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕前。。");
		System.out.println("签名：" + pjp.getSignature());
		Object result = pjp.proceed();
		System.out.println("环绕后。。");
		return result;
	}
}
