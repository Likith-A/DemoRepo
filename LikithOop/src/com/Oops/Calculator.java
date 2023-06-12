package com.Oops;

import java.util.Scanner;

class Calculator{
public int add(int a, int b) {

    return (a + b);

}
public double add(double a, double b, double c) {

    return (a + b + c);

}
public String add(String a, String b) {

    return (a + b);

}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the a and b int type values : ");

    int a = sc.nextInt();

    int b = sc.nextInt();

    Calculator c = new Calculator();

    System.out.println("Sum of 2 int values : " + c.add(a, b));

    System.out.println("Enter the e, f and g double type values : ");

    double e = sc.nextInt();

    double f = sc.nextInt();

    double g = sc.nextInt();

    System.out.println("Sum of 3 double values : " + c.add(e, f, g));

    System.out.println("Enter the h and j String type values : ");

    String h = sc.next();

    String j = sc.next();

    System.out.println("Concatination of 2 string values : " + c.add(h, j));
    sc.close();



}
}
