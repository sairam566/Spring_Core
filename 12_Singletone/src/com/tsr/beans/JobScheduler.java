package com.tsr.beans;

public class JobScheduler {
	
	public void execute() {
		DateConvertor dc = DateConvertor.getInstance();
		System.out.println("From JobScheduler: "+dc.hashCode());
	}
}
