package com.tsr;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.tsr.beans.Robot;

public class App {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/tsr/config/application-context.xml"));

		BeanPostProcessor postProcessor = beanFactory.getBean("requiredAnnotationBeanPostProcessor",BeanPostProcessor.class);
		
		((ConfigurableListableBeanFactory) beanFactory).addBeanPostProcessor(postProcessor);

		Robot robot = beanFactory.getBean("robot", Robot.class);

		System.out.println(robot);
	}
}
