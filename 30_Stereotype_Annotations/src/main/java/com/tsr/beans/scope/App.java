package com.tsr.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/tsr/beans/scope/application-context.xml");
      
      Bike bike1 = applicationContext.getBean("bike", Bike.class);
      bike1.ride();
      
      Bike bike2 = applicationContext.getBean("bike", Bike.class);
      bike2.ride();
      
      System.out.println(bike1);
      System.out.println(bike2);
      System.out.println("bike1 == bike2 : "+(bike1 == bike2));
      
      Car car1 = applicationContext.getBean("car",Car.class);
      car1.ride();
      Car car2 = applicationContext.getBean("car",Car.class);
      car2.ride();
      
      System.out.println(car1);
      System.out.println(car2);
      
      System.out.println("car1 == car2 : "+(car1 == car2));
    }
}
