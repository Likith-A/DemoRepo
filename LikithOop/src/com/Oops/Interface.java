package com.Oops;
import java.util.Scanner;



interface GeographicObject {

    double getArea();

 

    double getPerameter();

}

 

class Circle implements GeographicObject {

    private double radius;

 

    public Circle(double radius) {

        super();

        this.radius = radius;

    }

 

    public double getArea() {

        return (Math.PI * radius * radius);

    }

 

    public double getPerameter() {

        return (2 * Math.PI * radius);

    }

 

    @Override

    public String toString() {

        return "Circle [radius=" + radius + "]";

    }

 

}

 

class Rectangle implements GeographicObject {

    private double width;

    private double length;

 

    public Rectangle(double width, double length) {

        super();

        this.width = width;

        this.length = length;

    }

 

    public double getArea() {

        return (length * width);

    }

 

    public double getPerameter() {

        return (2 * (length + width));

    }

 

    @Override

    public String toString() {

        return "Rectangle [width=" + width + ", length=" + length + "]";

    }

 

}

public class Interface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the width and length : ");

        double width = sc.nextDouble();

        double length = sc.nextDouble();

        GeographicObject i = new Rectangle(width, length);

        System.out.println(i);

        System.out.println("The area and perimeter of Rectangle : " + i.getArea() + " ," + i.getPerameter());

        System.out.println("Enter the radius : ");

        double radius = sc.nextDouble();

        i = new Circle(radius);

        System.out.println(i);

        System.out.println("The area and perimeter of Circle : " + i.getArea() + " ," + i.getPerameter());
        sc.close();

 

    }

}
