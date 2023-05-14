package com.designpattern.FactoryDesignPattern;

public class VehicleFactory {
	public static Vehicle createVehicle(String type) {
		if(type.toLowerCase().equals("car")) {
			return new Car();
		}
		else if(type.toLowerCase().equals("bike")) {
			return new Bike();
		}
		else if(type.toLowerCase().equals("auto")) {
			return new Auto();
		}
		else {
			throw new IllegalArgumentException("Invalid vehicle type : "+type);
		}
	}
}
