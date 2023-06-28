package com.tsr.prop;

public class JVMPropertiesTest {

	public static void main(String[] args) {
		String id = System.getProperty("id");
		String name = System.getProperty("name");
		System.out.println("Id : " + id + " Name : " + name);
	}
}
