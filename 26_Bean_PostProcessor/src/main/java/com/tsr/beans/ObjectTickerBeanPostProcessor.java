package com.tsr.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.tsr.counter.ObjectTracker;

public class ObjectTickerBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println("From postProcessBefore Name: "+beanName+" Object: "+bean.toString());
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		ObjectTracker.increment();
		System.out.println("From postProcessAfter Name: "+beanName+" Object: "+bean.toString());
		return bean;
	}

}
