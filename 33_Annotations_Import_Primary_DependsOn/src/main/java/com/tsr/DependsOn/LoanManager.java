package com.tsr.DependsOn;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn(value = "cacheManager")
public class LoanManager {
	
	public LoanManager() {
		System.out.println("loan manager created");
	}
}
