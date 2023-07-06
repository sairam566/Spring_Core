package com.tsr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.tsr.beans.Rectangle;

public class BeanLifeCycleTest 
{
    public static void main( String[] args )
    {
    	BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/tsr/config/application-context.xml"));
    	Rectangle rectangle = beanFactory.getBean("rectangle",Rectangle.class);
    	System.out.println(rectangle.getArea());
    	((ConfigurableListableBeanFactory)beanFactory).destroySingletons();
    }
}
