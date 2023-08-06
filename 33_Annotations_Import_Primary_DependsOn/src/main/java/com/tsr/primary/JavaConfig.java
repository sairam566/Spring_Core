package com.tsr.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"com.tsr.primary"})
public class JavaConfig {
	
	@Bean
	public MonoBell monoBell() {
		return new MonoBell();
	}
	
	@Bean
	@Primary
	public DigitalBell digitalBell() {
		return new DigitalBell();
	}
}
