package com.tsr.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LookupTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.tsr.lookup");
		Car car = context.getBean("car", Car.class);
		car.drive();
		car.drive();
	}
}
