package com.tsr.beans.stereotype;

import org.springframework.stereotype.Controller;

@Controller
public class Train {
	public void ride() {
		System.out.println("Train Ride...");
	}
}
