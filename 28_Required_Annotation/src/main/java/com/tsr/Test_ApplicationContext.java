package com.tsr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tsr.beans.Robot;

public class Test_ApplicationContext {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/tsr/config/application-context.xml");
		
		Robot robot = applicationContext.getBean("robot", Robot.class);

		System.out.println(robot);
		
		//String[] allBeanNames = applicationContext.getBeanDefinitionNames();

//		for (String beanName : allBeanNames) {
//			System.out.println(beanName);
//		}
	}
}
