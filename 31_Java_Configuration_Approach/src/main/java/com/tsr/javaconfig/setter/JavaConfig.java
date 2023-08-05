package com.tsr.javaconfig.setter;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Turbine turbine() {
		return new Turbine();
	}
	
	@Bean(autowire = Autowire.BY_NAME)
	public PowerStation powerStation() {
		return new PowerStation();
	}
}
