package com.dependency.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args)
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext(" com/dependency/reference/config.xml");
         System.out.println(context);
         
       Student st =  context.getBean("st",Student.class);
       
       System.out.println(st);
       
    }
}
