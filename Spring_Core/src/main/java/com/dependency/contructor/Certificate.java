package com.dependency.contructor;

public class Certificate {
	
	private int id;
	private String certiName;
	public Certificate(int id, String certiName) {
		super();
		this.id = id;
		this.certiName = certiName;
	}
	@Override
	public String toString() {
		return "Certificate [id=" + id + ", certiName=" + certiName + "]";
	}
	
	

}
