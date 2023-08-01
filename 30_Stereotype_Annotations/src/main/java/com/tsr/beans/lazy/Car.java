package com.tsr.beans.lazy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class Car {
	
	
	public Car() {
		System.out.println("Car Constructor");
	}

	public void ride() {
		System.out.println("Car Ride...");
	}
}
