package com.huanle.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huanle.aop.PrinterService;

public class MainApp {
	public static void main(String[] args) {
	    ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
	    
//	    使用动态字节码生成技术实现AOP原理是在运行期间目标字节码加载后，生成目标类的子类，
//	    将切面逻辑加入到子类中，所以cglib实现AOP不需要基于接口,即被代理的类不是接口的实现也没问题，使用继承也能完成
//	    所以这里能(PrinterService) myServiceProxy行得通，因为cust是子类对象
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
