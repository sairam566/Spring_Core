package com.tsr.with.sourcecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPropertySource {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.tsr.with.sourcecode");
		Book book = context.getBean("book", Book.class);
		System.out.println(book);
	}
}
