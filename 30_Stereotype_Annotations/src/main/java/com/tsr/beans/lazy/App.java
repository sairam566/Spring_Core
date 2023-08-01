package com.tsr.beans.lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/tsr/beans/lazy/application-context.xml");
      
      //Bike bike1 = applicationContext.getBean("bike", Bike.class);
      //bike1.ride();
      
      //Car car1 = applicationContext.getBean("car",Car.class);
      //car1.ride();
    
    }
}
