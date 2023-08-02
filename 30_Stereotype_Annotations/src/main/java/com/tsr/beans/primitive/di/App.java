package com.tsr.beans.primitive.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/tsr/beans/primitive/di/application-context.xml");
      
     Meeting meeting = applicationContext.getBean("meeting",Meeting.class);
     
     System.out.println(meeting);
    
    }
}
