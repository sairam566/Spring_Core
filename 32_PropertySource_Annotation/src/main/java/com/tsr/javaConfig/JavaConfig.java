package com.tsr.javaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/tsr/javaConfig/common.properties")
@ComponentScan(basePackages = {"com.tsr.javaConfig"})
public class JavaConfig {
	
	@Bean
	public GasPump gasPump(@Value("${GasPump.pumpNo}") int pumpNo,@Value("${GasPump.fuelType}") String fuelType) {
		GasPump gasPump = new GasPump();
		gasPump.setPumpNo(pumpNo);
		gasPump.setFuelType(fuelType);
		return gasPump;
	}
}
