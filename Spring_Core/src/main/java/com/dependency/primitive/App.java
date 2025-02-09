package com.dependency.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args)
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext(" com/dependency/primitive/config.xml");
         System.out.println(context);
         
       Student st =  context.getBean("st1",Student.class);
       
       System.out.println(st);
       Student st1 =  context.getBean("st2",Student.class);
       System.out.println(st1);
    }
}
