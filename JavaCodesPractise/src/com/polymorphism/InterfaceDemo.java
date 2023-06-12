package com.polymorphism;

interface Shapes {
	double getArea();

	double getperimeter();
}

class Circles implements Shapes {
	float radius;

	public Circles(float radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (Math.PI * radius * radius);
	}

	@Override
	public double getperimeter() {
		return (2 * Math.PI * radius);
	}

}

class Rectangles implements Shapes {
	float length, breadth;

	public Rectangles(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double getArea() {
		return (length * breadth);
	}

	@Override
	public double getperimeter() {
		// TODO Auto-generated method stub
		return (2 * (length * breadth));
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Circles c1 = new Circles(4);

		System.out.println("area of circle: " + c1.getArea());

		System.out.println("perimerter of circle: " + c1.getperimeter());

		Rectangles r1 = new Rectangles(7.0f, 8f);

		System.out.println("area of rectangle: " + r1.getArea());

		System.out.println("perimerter of rectangle: " + r1.getperimeter());
	}

}
