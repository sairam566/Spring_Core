package com.tsr.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tsr/inject/javaconfig-beans.xml");
		Radio radio = context.getBean("radio", Radio.class);
		radio.on();
	}
}
