package com.tsr.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Radio {
	
	@Autowired
	@Qualifier("main")
	private Tuner tuner;

	public Tuner getTuner() {
		return tuner;
	}

	public void setTuner(Tuner tuner) {
		this.tuner = tuner;
	}

	@Override
	public String toString() {
		return "Radio [tuner=" + tuner + "]";
	}
}
