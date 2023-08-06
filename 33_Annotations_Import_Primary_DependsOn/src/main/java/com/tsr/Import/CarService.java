package com.tsr.Import;

public class CarService {
	
	private CarDAO carDAO;

	public CarService(CarDAO carDAO) {
		super();
		this.carDAO = carDAO;
		System.out.println("CarService Object created");
	}
	
}
