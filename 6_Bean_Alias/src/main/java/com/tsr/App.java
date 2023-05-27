package com.tsr;

import java.util.stream.Stream;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.tsr.beans.Person;

public class App 
{
    public static void main( String[] args )
    {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/tsr/config/application-context.xml"));
        
        Person person = beanFactory.getBean("p2",Person.class);
        
        String[] alias = beanFactory.getAliases("person");
        System.out.println("Bean Alias : ");
        Stream.of(alias).forEach(System.out::println);
        System.out.println(person);
    }
}
