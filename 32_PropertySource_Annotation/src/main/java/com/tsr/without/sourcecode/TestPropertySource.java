package com.tsr.without.sourcecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPropertySource {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Book hldBook = context.getBean("HLDDesign", Book.class);
		System.out.println(hldBook);
		
		Book lldBook = context.getBean("LLDDesign", Book.class);
		System.out.println(lldBook);
	}
}
