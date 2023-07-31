package com.tsr.beans.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class Car {
	public void ride() {
		System.out.println("Car Ride...");
	}
}
