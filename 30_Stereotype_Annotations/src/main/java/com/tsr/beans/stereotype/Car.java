package com.tsr.beans.stereotype;

import org.springframework.stereotype.Service;

@Service
public class Car {
	public void ride() {
		System.out.println("Car Ride...");
	}
}
