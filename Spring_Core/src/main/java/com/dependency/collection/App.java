package com.dependency.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dependency/collection/config.xml");
		
		Student st=context.getBean("st1",Student.class);
		
		System.out.println(st);
		
	}

}
