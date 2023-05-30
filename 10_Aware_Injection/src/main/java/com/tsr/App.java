package com.tsr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.tsr.beans.Car;

public class App 
{
    public static void main( String[] args )
    {
       BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/tsr/config/application-context.xml"));
       
       Car car = beanFactory.getBean("car",Car.class);
       
       car.drive();
    }
}
