package com.huanle.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AOPAroundMethod implements MethodInterceptor {

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		System.out.println("Method name : " + methodInvocation.getMethod().getName());
		System.out.println("Method arguments : " + Arrays.toString(methodInvocation.getArguments()));
		System.out.println("This object : " + methodInvocation.getThis().getClass());

		System.out.println("AOPAroundMethod : Before method call.");

		try {
			// proceed to original method call
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