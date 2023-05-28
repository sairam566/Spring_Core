package com.tsr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.tsr.byname.Car;
import com.tsr.bytype.Distributer;
import com.tsr.bytype.SalesOrder;
import com.tsr.constructor.Bike;

public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("/com/tsr/config/application-context.xml"));
    	
    	// ByName
    	SalesOrder salesOrder = beanFactory.getBean("salesOrder",SalesOrder.class);
    	System.out.println(salesOrder);
    	
    	// ByType
    	Car car = beanFactory.getBean("car",Car.class);
    	System.out.println(car);
    	
    	// Constructor
    	// It uses ByType to identify the dependency object from IOC
    	Bike bike = beanFactory.getBean("bike",Bike.class);
    	System.out.println(bike);
    }
}
