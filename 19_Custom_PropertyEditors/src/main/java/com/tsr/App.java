package com.tsr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.tsr.bean.NavigationMap;
import com.tsr.registar.GlobalPropertyEditorRegistrar;

public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/tsr/config/application-config.xml"));
    	((ConfigurableListableBeanFactory)beanFactory).addPropertyEditorRegistrar(new GlobalPropertyEditorRegistrar());
    	NavigationMap map = beanFactory.getBean("map",NavigationMap.class);
    	
    	System.out.println(map);
    }
}
