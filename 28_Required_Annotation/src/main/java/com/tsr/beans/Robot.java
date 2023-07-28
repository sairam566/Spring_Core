package com.tsr.beans;

import org.springframework.beans.factory.annotation.Required;

public class Robot {
	
	private Chip chip;
	private String name;
	
	public Robot() {
		super();
	}

	public Chip getChip() {
		return chip;
	}
	
	@Required
	public void setChip(Chip chip) {
		this.chip = chip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Robot [chip=" + chip + ", name=" + name + "]";
	}

}
