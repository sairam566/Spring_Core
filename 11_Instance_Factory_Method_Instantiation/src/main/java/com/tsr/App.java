package com.tsr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.tsr.bean.GetStockPriceController;

public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new DefaultListableBeanFactory();
        
        BeanDefinitionReader xmlReader = new XmlBeanDefinitionReader((DefaultListableBeanFactory) factory);
        
        xmlReader.loadBeanDefinitions(new ClassPathResource("com/tsr/config/application-context.xml"));
        
        GetStockPriceController controller = factory.getBean("getStockPriceController",GetStockPriceController.class);
        double price = controller.findStockPrice("cipla");
		System.out.println("price : " + price);
    }
}
