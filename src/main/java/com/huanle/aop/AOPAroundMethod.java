package com.huanle.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AOPAroundMethod implements MethodInterceptor {

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		//可以根据被调用的函数名称和参数或者被代理对象的名字来定制不同的功能
		System.out.println("Method name : " + methodInvocation.getMethod().getName());
		System.out.println("Method arguments : " + Arrays.toString(methodInvocation.getArguments()));
		System.out.println("This object : " + methodInvocation.getThis().getClass());

		System.out.println("AOPAroundMethod : Before method call.");

		try {
			// proceed to original method call原本的方法在这里被执行
			Object result = methodInvocation.proceed();

			// same with AfterReturningAdvice
			System.out.println("AOPAroundMethod : after call.");

			return result;

		} catch (IllegalArgumentException e) {
			System.out.println("AOPAroundMethod : Throw exception call.");
			throw e;
		}
	}
}