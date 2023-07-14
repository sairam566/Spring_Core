package com.tsr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.tsr.beans.LoanManager;

public class App {
	public static void main(String[] args) throws Exception {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/tsr/config/application-context.xml"));

		LoanManager loanManager = beanFactory.getBean("loanManager", LoanManager.class);

		double ia = loanManager.interestAmount(100000, 1, "hyd");

		System.out.println("interest amount : " + ia);
	}
}
