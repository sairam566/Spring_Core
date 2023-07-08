package com.tsr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.tsr.bean.Rectangle;
import com.tsr.bean.ShutdownHook;

public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/tsr/config/application-context.xml"));
    	
    	Rectangle rectangle = beanFactory.getBean("rectangle",Rectangle.class);
    	System.out.println(rectangle.getArea());
    	
    	ShutdownHook hook = beanFactory.getBean("shutdownHook", ShutdownHook.class);
    	
    	Runtime.getRuntime().addShutdownHook(new Thread(hook));
    }
}
