package com.tsr.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Alarm alarm = context.getBean("alarm", Alarm.class);
		alarm.remind();// ringing digital bell
	}
}