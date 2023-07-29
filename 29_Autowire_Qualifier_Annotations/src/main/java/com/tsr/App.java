package com.tsr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tsr.beans.Radio;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/tsr/config/application-context.xml");
       
       Radio radio = applicationContext.getBean("radio",Radio.class);
       
       System.out.println(radio);
    }
}
