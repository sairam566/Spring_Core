package com.tsr.javaconfig.ambiguity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	@Qualifier("Wind")
	public Turbine turbine1() {
		return new Turbine();
	}
	
	@Bean(name = "Water")
	public Turbine turbine2() {
		return new Turbine();
	}
	
	@Bean
	public PowerStation powerStation(@Qualifier("Wind") Turbine turbine) {
		return new PowerStation(turbine);
	}
}
