package com.tsr.beans;

public class Tuner {
	protected String tunerType;

	public String getTunerType() {
		return tunerType;
	}

	public void setTunerType(String tunerType) {
		this.tunerType = tunerType;
	}

	@Override
	public String toString() {
		return "Tuner [tunerType=" + tunerType + "]";
	}	
}
