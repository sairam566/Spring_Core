package com.tsr.javaconfig.constructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Turbine turbine() {
		return new Turbine();
	}
	
	@Bean
	public PowerStation powerStation(Turbine turbine) {
		return new PowerStation(turbine);
	}
}
