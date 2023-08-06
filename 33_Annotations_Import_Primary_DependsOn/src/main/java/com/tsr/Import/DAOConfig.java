package com.tsr.Import;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DAOConfig {
	
	@Bean
	public CarDAO getCarDAO() {
		return new CarDAO();
	}
}