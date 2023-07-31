package com.tsr.beans.stereotype;

import org.springframework.stereotype.Component;

@Component("pulseRocket")
public class Rocket {
	public void ride() {
		System.out.println("Rocket Ride...");
	}
}
