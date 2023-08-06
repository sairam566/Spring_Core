package com.tsr.javaConfig;

//No Source Code
public class GasPump {
	private int pumpNo;
	private String fuelType;

	public GasPump() {
		super();
	}

	public int getPumpNo() {
		return pumpNo;
	}

	public void setPumpNo(int pumpNo) {
		this.pumpNo = pumpNo;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "GasPump [pumpNo=" + pumpNo + ", fuelType=" + fuelType + "]";
	}
}
