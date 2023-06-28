package com.tsr.beans;

public class Car {
	
	private int id;
	private Engine engine;
	private String fuelType;
	
	public Car() {}

	public Car(int id, Engine engine, String fuelType) {
		super();
		this.id = id;
		this.engine = engine;
		this.fuelType = fuelType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", engine=" + engine + ", fuelType=" + fuelType + "]";
	}
}
