package com.polymorphism;

/**
 * To get the area and perimeter of the circle and
 * 
 * @author Likith
 * @since 03/06/2023
 * @version jdk11
 *
 */
abstract class Shape {

	private int radius, length, breadth;

	public Shape(int radius) {

		super();

		this.radius = radius;

	}

	public Shape(int length, int breadth) {

		super();

		this.length = length;

		this.breadth = breadth;

	}

	public int getRadius() {

		return radius;

	}

	public void setRadius(int radius) {

		this.radius = radius;

	}

	public int getLength() {

		return length;

	}

	public void setLength(int length) {

		this.length = length;

	}

	public int getBreadth() {

		return breadth;

	}

	public void setBreadth(int breadth) {

		this.breadth = breadth;

	}

	public abstract double area();

	public abstract double perimeter();

}

class Circlea extends Shape {

	public Circlea(int length, int breadth) {

		super(length, breadth);

	}

	public Circlea(int radius) {

		super(radius);

	}

	@Override

	public double area() {

		return 3.14 * getRadius() * getRadius();

	}

	@Override

	public double perimeter() {

		return 2 * 3.14 * getRadius();

	}

}

class Square extends Shape {

	public Square(int length, int breadth) {

		super(length, breadth);

	}

	public Square(int radius) {

		super(radius);

	}

	@Override

	public double area() {

		// TODO Auto-generated method stub

		return getRadius() * getRadius();

	}

	@Override

	public double perimeter() {

		return 4 * getRadius();

	}

}

public class AbstractDemo {

	public static void main(String[] args) {

		Shape s = new Circlea(3);

		System.out.println(" area of circle " + s.area());

		System.out.println(" perimeter of circle " + s.perimeter());

		s = new Square(9);

		System.out.println(" area of square " + s.area());

		System.out.println(" perimeter of square " + s.perimeter());

	}

}