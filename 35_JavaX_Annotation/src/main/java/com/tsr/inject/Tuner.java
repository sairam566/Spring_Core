package com.tsr.inject;

public class Tuner {
	private int frequency;

	public void receive() {
		System.out.println("receiving signals at frequency : " + frequency);
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

}
