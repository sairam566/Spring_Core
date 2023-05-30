package com.tsr.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Car implements BeanFactoryAware{

	private IEngine engine;
	private String engineId;
	private BeanFactory beanFactory;

	public Car() {
		super();
	}

	public Car(String engineId) {
		super();
		this.engineId = engineId;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
	
	public void drive() {
		engine = beanFactory.getBean(engineId,IEngine.class);
		engine.start();
	}
	
	public IEngine getEngine() {
		return engine;
	}

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}

	public String getEngineId() {
		return engineId;
	}

	public void setEngineId(String engineId) {
		this.engineId = engineId;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", engineId=" + engineId + ", beanFactory=" + beanFactory + "]";
	}

}
