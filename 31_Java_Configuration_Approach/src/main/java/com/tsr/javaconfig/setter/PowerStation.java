package com.tsr.javaconfig.setter;

public class PowerStation {
	
	private Turbine turbine;

	public PowerStation() {
		super();
	}
	
	public void on() {
		turbine.produce();
	}

	public Turbine getTurbine() {
		return turbine;
	}

	public void setTurbine(Turbine turbine) {
		this.turbine = turbine;
	}

	@Override
	public String toString() {
		return "PowerStation [turbine=" + turbine + "]";
	}
	
}
