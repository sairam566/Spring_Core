package com.tsr.beans.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	
	public Car() {
		System.out.println("Car Constructor");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Initilizing Car...");
	}
	
	public void ride() {
		System.out.println("Car Ride...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroying Car...");
	}
}
