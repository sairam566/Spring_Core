package com.tsr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.tsr.prototype.Car;
import com.tsr.singletone.BiCycle;
import com.tsr.singletone.DateConverter;

public class App {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		
		BiCycle biCycle1 = factory.getBean("biCycle1", BiCycle.class);
		BiCycle biCycle2 = factory.getBean("biCycle1", BiCycle.class);
		System.out.println("biCycle1 == biCycle2 is = " + (biCycle1 == biCycle2));
		
		BiCycle biCycle3 = factory.getBean("biCycle2", BiCycle.class);
		System.out.println("biCycle1 == biCycle3 is = " + (biCycle1 == biCycle3));
		
		//Calling Class with Private Constructor
		DateConverter converter1 = factory.getBean("dateConverter1",DateConverter.class);
		System.out.println(converter1);
		
		DateConverter converter2 = factory.getBean("dateConverter2",DateConverter.class);
		DateConverter converter3 = DateConverter.getInstance();
		System.out.println("converter2 == converter3 is "+(converter2 == converter3));
		
		
		Car car1 = factory.getBean("car",Car.class);
		Car car2 = factory.getBean("car",Car.class);
		System.out.println("Car1 == Car2 is "+(car1 == car2));
		
	}
}
