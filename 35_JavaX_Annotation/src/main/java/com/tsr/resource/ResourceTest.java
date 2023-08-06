package com.tsr.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceInjectTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tsr/resource/javaconfig-beans.xml");
		Radio radio = context.getBean("radio", Radio.class);
		radio.on();
	}
}
