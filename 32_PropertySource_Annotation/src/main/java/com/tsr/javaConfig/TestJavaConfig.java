package com.tsr.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaConfig {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		GasStation gasStation = applicationContext.getBean("gasStation",GasStation.class);
		System.out.println(gasStation);
	}
}
