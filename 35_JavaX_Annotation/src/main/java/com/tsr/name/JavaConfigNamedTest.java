package com.tsr.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigNamedTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.tsr.name");
		Toy toy = context.getBean("toy", Toy.class);
		toy.on();
	}
}
