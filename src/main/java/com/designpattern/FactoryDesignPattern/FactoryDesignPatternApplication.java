package com.designpattern.FactoryDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryDesignPatternApplication.class, args);
		Vehicle car = VehicleFactory.createVehicle("car");
		car.drive();
		
		Vehicle bike = VehicleFactory.createVehicle("bike");
		bike.drive();
		
		Vehicle auto = VehicleFactory.createVehicle("auto");
		auto.drive();
	}

}
