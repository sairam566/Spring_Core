package com.tsr.beans.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/tsr/beans/lifecycle/application-context.xml");
      
      
      Car car1 = applicationContext.getBean("car",Car.class);
      car1.ride();
    
    }
}
