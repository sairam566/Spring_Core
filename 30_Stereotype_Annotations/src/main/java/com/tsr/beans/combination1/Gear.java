package com.tsr.beans.combination1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Have Source Code
// Target Class
@Component
public class Gear {
	
	@Autowired
	private ToyCar toyCar;
	
	public void forward() {
		toyCar.go();
	}
}
