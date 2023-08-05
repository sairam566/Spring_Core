package com.tsr.javaconfig.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		PowerStation powerStation = context.getBean("powerStation",PowerStation.class);
		powerStation.on();
	}
}
