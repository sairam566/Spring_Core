package com.tsr;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.tsr.beans.CalendarFactoryBean;
import com.tsr.beans.Meeting;

public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/tsr/config/application-context.xml"));
    	
//    	Meeting meeting1 = beanFactory.getBean("meeting",Meeting.class);
//    	
//    	System.out.println(meeting1);
//    	
//    	Meeting meeting2 = beanFactory.getBean("meeting",Meeting.class);
//    	
//    	System.out.println(meeting2);
//    	
//    	CalendarFactoryBean factoryBean = beanFactory.getBean("&calendar",CalendarFactoryBean.class);
//    	
//    	System.out.println(factoryBean);
    	
    	//Run the program once by changing isSingleton to TRUE & FALSE and observe O/P
    	Calendar calendar1 = beanFactory.getBean("calendar",Calendar.class);
    	Calendar calendar2 = beanFactory.getBean("calendar",Calendar.class);
    }
}
