package com.lifecycle.xml;

public class Student {
	
	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	// Achieve Life-Cycle
	
	public void init()
	{
		 System.out.println( "Init():Initialization call" );
	}

	public void destroy()
	{
		 System.out.println( "Destroy call:Destroy Started" );
	}
}
