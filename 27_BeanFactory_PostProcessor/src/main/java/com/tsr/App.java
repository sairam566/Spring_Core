package com.tsr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.tsr.beans.ConnectionManager;

public class App 
{
    public static void main( String[] args )
    {	
    	
    	//Using BeanFactory
    	BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/tsr/config/application-context.xml"));
    	
    	BeanFactoryPostProcessor bfpp  = beanFactory.getBean("ppc", BeanFactoryPostProcessor.class);
    	
    	bfpp.postProcessBeanFactory((ConfigurableListableBeanFactory) beanFactory);
    	
    	
    	//Using BeanDefinition we have to register BeanFactory_Postprocessor
//    	DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//    	
//    	BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
//    	
//    	reader.loadBeanDefinitions(new ClassPathResource("com/tsr/config/application-context.xml"));
//    	
//    	BeanFactoryPostProcessor postProcessor = beanFactory.getBean("ppc",BeanFactoryPostProcessor.class);
//    	
//    	postProcessor.postProcessBeanFactory(beanFactory);
    	
    	//Using ApplicationContext we don't have to register BeanFactory_Postprocessor
//		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("com/tsr/config/application-context.xml");
    	
    	ConnectionManager connectionManager = beanFactory.getBean("connectionManager", ConnectionManager.class);
    	
    	System.out.println(connectionManager);
    }
}
