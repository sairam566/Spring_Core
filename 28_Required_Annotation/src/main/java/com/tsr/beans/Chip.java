package com.tsr.beans;

import org.springframework.beans.factory.annotation.Required;

public class Chip {
	
	private int chipNo;
	private String chipType;

	public Chip() {
		super();
	}

	public int getChipNo() {
		return chipNo;
	}
	
	@Required
	public void setChipNo(int chipNo) {
		this.chipNo = chipNo;
	}

	public String getChipType() {
		return chipType;
	}

	public void setChipType(String chipType) {
		this.chipType = chipType;
	}

	@Override
	public String toString() {
		return "Chip [chipNo=" + chipNo + ", chipType=" + chipType + "]";
	}
	
}
