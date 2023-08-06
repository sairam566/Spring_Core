package com.tsr.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Have Source Code
@Component
public class GasStation {

	@Autowired
	private GasPump gasPump;

	@Value("${GasStation.gasStationName}")
	private String gasStationName;

	public GasStation() {
		super();
	}

	public GasPump getGasPump() {
		return gasPump;
	}

	public void setGasPump(GasPump gasPump) {
		this.gasPump = gasPump;
	}

	public String getGasStationName() {
		return gasStationName;
	}

	public void setGasStationName(String gasStationName) {
		this.gasStationName = gasStationName;
	}

	@Override
	public String toString() {
		return "GasStation [gasPump=" + gasPump + ", gasStationName=" + gasStationName + "]";
	}

}
