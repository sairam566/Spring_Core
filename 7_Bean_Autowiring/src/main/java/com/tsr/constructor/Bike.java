package com.tsr.constructor;

public class Bike {
	private String name;
	private FuelTank fuelTank;
	
	
	public Bike(FuelTank fuelTank) {
		super();
		this.fuelTank = fuelTank;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FuelTank getFuelTank() {
		return fuelTank;
	}

	public void setFuelTank(FuelTank fuelTank) {
		this.fuelTank = fuelTank;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", fuelTank=" + fuelTank + "]";
	}
}
