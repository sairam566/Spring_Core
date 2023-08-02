package com.tsr.beans.combination2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/tsr/beans/combination2/application-context.xml");
      
     Meeting meeting = applicationContext.getBean("meeting",Meeting.class);
     
     System.out.println(meeting);
    
    }
}
