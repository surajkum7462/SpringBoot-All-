package com.dependency.contructor;

import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private String address ;
	private List<String> course;
	private Certificate certi;
	
	
	
	
	
	
	
public Student(int id, String name, String address, List<String> course, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.course = course;
		this.certi = certi;
	}







@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + ", course=" + course + ", certi=" + certi
			+ "]";
}







//	//  In xml we have to specify the type of variable to avoid ambiguity
//	public Student(int id, String name) {
//		System.out.println("Int String constructor");
//		
//		
//		this.id = id;
//		this.name = name;
//	}
//	
//	
//	// if we set opposite arguments then see 
//	public Student(String name, int id) {
//		System.out.println("String int constructor");
//		
//		this.id = id;
//		this.name = name;
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	//But by default in xml type is string so firstly this method is called if we doesn't specify the type of variable
//	public Student(String name, String address) {
//		System.out.println("String String constructor");
//		this.name = name;
//		this.address = address;
//	}
	
	
	
	

}
