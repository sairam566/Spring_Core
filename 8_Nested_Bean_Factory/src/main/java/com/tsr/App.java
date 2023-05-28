package com.tsr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.tsr.beans.Bike;

public class App 
{
    public static void main( String[] args )
    {
        BeanFactory parentFactory = new XmlBeanFactory(new ClassPathResource("/com/tsr/config/parent-context.xml"));
        
        BeanFactory childFactory = new XmlBeanFactory(new ClassPathResource("/com/tsr/config/child-context.xml"),parentFactory);
        
        Bike bike = childFactory.getBean("bike",Bike.class);
        
        System.out.println(bike);
    }
}
