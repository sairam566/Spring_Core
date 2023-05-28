package com.tsr.byname;

public class Car {
	
	private String name;
	private double price;
	private Engine engine;
	
	public Car() {
		super();
	}

	public Car(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", engine=" + engine + "]";
	}
}
