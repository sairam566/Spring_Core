package com.tsr.beans.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Bike {
	
	public Bike() {
		System.out.println("Bike Constructor");
	}

	public void ride() {
		System.out.println("Bus Ride...");
	}
}