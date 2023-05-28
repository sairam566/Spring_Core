package com.tsr.bytype;

public class SalesOrder {
	
	private Distributer distributer;

	public SalesOrder() {
		super();
	}

	public Distributer getDistributer() {
		return distributer;
	}

	public void setDistributer(Distributer distributer) {
		this.distributer = distributer;
	}

	@Override
	public String toString() {
		return "SalesOrder [distributer=" + distributer + "]";
	}
	
}
