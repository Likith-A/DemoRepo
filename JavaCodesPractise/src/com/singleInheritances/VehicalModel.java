package com.singleInheritances;
class Vehicle {
	String make;
	String model;
	int year;
	public Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public void displayInfo() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
	}
	class Car extends Vehicle {
		int numDoors;
		public Car(String make, String model, int year, int numDoors) {

			super(make, model, year);
			this.numDoors = numDoors;
		}
		public void startEngine() {
			System.out.println("Engine starts");
		}
	}
	class Motorcycle extends Vehicle {
		boolean isDoorsThere;
		public Motorcycle(String make, String model, int year, boolean isDoorsThere) {
			super(make, model, year);
			this.isDoorsThere = isDoorsThere;
		}
		public boolean startEngine() {
			System.out.println("Engine starts.");
			return isDoorsThere;
		}
	}
	public class CarMotorcycleClass {

		public void main(String[] args) {
			Car car = new Car("maruti", "ertiga", 2021, 6);
			car.displayInfo();
			car.startEngine();
			System.out.println();
			Motorcycle motorcycle = new Motorcycle("Tvs", "ApacheRr310", 2021, false);
			//System.out.println(motorcycle.displayInfo());
			System.out.println(motorcycle.startEngine());
		}
	}
}
    