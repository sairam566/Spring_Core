package com.tsr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.tsr.beans.PlanFinder;

public class App {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/tsr/config/application-context.xml"));
		PlanFinder finder = beanFactory.getBean("planFinder", PlanFinder.class);
		finder.findPlans("11", 12, 2, true);
	}
}
