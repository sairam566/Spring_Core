package com.tsr.beans;

public class TodoManager {
	
	public void manage() {
		DateConvertor dc = DateConvertor.getInstance();
		System.out.println("From TodoManager: "+dc.hashCode());
	}
}
