package com.tsr.Import;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
	
	@Bean
	public CarService getCarService(CarDAO carDAO){
		return new CarService(carDAO);
	}
}
