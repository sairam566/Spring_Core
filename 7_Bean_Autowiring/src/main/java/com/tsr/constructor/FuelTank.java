package com.tsr.constructor;

public class FuelTank {
	private int capacity;
	private String type;

	public FuelTank() {
		super();
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "FuelTank [capacity=" + capacity + ", type=" + type + "]";
	}

}
