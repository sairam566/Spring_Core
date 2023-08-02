package com.tsr.beans.combination1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/tsr/beans/combination1/application-context.xml");
      
      Gear gear = applicationContext.getBean("gear",Gear.class);
      
      gear.forward();
    }
}
