package com.tsr.beans;

import java.util.Arrays;
import java.util.List;

public class PlanFinder {
	
	public List<String> findPlans(String ageGroup, int copay, int coverageType, boolean cashless) {
		System.out.println("From Original Method");
		return Arrays.asList(new String[]{"plan1", "plan2"});
	}
}
