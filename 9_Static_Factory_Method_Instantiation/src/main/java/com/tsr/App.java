package com.tsr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.tsr.bean.JobSchedule;

public class App 
{
    public static void main( String[] args )
    {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/tsr/config/application-context.xml"));
        
        JobSchedule jobSchedule = beanFactory.getBean("jobSchedule",JobSchedule.class);
        
        System.out.println(jobSchedule);
    }
}
