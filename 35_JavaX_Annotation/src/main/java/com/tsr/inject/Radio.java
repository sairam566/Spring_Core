package com.tsr.inject;

import javax.inject.Inject;
import javax.inject.Named;

public class Radio {
	@Inject
	@Named("tuner1")
	private Tuner tuner;

	public void on() {
		tuner.receive();
		System.out.println("playing ...");
	}

	void setTuner(Tuner tuner) {
		this.tuner = tuner;
	}

}
