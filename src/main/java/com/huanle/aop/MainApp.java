package com.huanle.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huanle.aop.PrinterService;

public class MainApp {
	public static void main(String[] args) {
	    ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
	    PrinterService cust = (PrinterService) appContext.getBean("myServiceProxy");
	    cust.printName();
	    System.out.println("******************");
	    cust.printURL();
	    System.out.println("******************");
	    try {
	      cust.printThrowException();
	    } catch (Exception e) {
	    }
	  }
}
