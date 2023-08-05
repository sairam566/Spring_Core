package com.tsr.javaconfig.ambiguity;

public class PowerStation {
	
	private Turbine turbine;

	
	public PowerStation(Turbine turbine) {
		super();
		this.turbine = turbine;
		System.out.println("Constructor Injection");
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
