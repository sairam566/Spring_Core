package com.tsr.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class ShutdownHook implements Runnable, BeanFactoryAware {

	private BeanFactory beanFactory;

	@Override
	public void run() {
		((ConfigurableListableBeanFactory) beanFactory).destroySingletons();
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

}
