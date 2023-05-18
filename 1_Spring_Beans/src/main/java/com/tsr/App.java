package com.tsr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.tsr.beans.MessageWriter;
import com.tsr.beans.PDFMessageFormatterImpl;

public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory =new XmlBeanFactory(new ClassPathResource("com/tsr/config/application-context.xml"));
        
        MessageWriter messageWriter = factory.getBean("messageWriter", MessageWriter.class);
        
        PDFMessageFormatterImpl pdfMessageFormatterImpl = factory.getBean("pdfMessageFormat",PDFMessageFormatterImpl.class);
        
        messageWriter.setMessageFormatter(pdfMessageFormatterImpl);
        
        messageWriter.writeMessage("Hello Spring!");
    }
}
