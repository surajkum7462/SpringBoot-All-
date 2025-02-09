package com.lifecycle.xml;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/lifecycle/xml/config.xml");
		
	 context.registerShutdownHook();
		
		Student st =context.getBean("st",Student.class);
		
		System.out.println(st);

	}

}
