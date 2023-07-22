package com.tsr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.tsr.beans.GasStation;
import com.tsr.beans.Guarage;
import com.tsr.beans.ObjectTickerBeanPostProcessor;
import com.tsr.counter.ObjectTracker;

public class App 
{
    public static void main( String[] args )
    {
    	
    	// Using Bean Definition
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        
//        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
//        
//        reader.loadBeanDefinitions(new ClassPathResource("com/tsr/config/application-context.xml"));
    	
//		  ObjectTickerBeanPostProcessor postProcessor = beanFactory.getBean("objectTickerBeanPostProcessor", ObjectTickerBeanPostProcessor.class);
        
//		  beanFactory.addBeanPostProcessor(postProcessor);
    	
    	//Using ApplicationContext
    	ApplicationContext beanFactory = new ClassPathXmlApplicationContext("com/tsr/config/application-context.xml");
        
        beanFactory.getBean("gasStation",GasStation.class);
        beanFactory.getBean("guarage",Guarage.class);
        
        System.out.println(ObjectTracker.getCounter());
    }
}
