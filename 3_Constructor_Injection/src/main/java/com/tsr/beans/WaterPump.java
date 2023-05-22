package com.tsr.beans;

public class WaterPump {
	
	private Moter moter;

	public WaterPump() {
		super();
	}

	public WaterPump(Moter moter) {
		super();
		this.moter = moter;
	}
	
	public void on() {
		moter.run();
	}
}
