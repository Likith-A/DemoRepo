package com.polymorphism;
class Vehicle{
	public void run() {
		System.out.println("inside vehicle run method");
	}
}
class Truck extends Vehicle{
	public void run() {
		System.out.println("inside truck run method");
	}
}
class Bike extends Vehicle{
	public void run() {
		System.out.println("inside bike run method");
	}
}
public class DemoMethodOverriding {
     public static void main(String[] args) {
		
    	 Vehicle vehicle = new Vehicle();
    	 
    	 vehicle = new Truck();// Truck class run Vehicle
    	 vehicle = new Bike();// Bike class run Vehicle
    	 
    	 vehicle.run();
    	 
	}
}
