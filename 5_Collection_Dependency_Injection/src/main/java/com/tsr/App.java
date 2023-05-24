package com.tsr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.tsr.list.Parcel;
import com.tsr.set.Store;

public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("/com/tsr/config/application-context.xml"));
        
       Parcel parcel = factory.getBean("parcel",Parcel.class);
        
        System.out.println(parcel);
        
        Store store = factory.getBean("store",Store.class);
        
        System.out.println(store);
    }
}
