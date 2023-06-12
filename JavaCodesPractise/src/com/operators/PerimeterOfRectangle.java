package com.operators;

import java.util.Scanner;

/**
 * To find the perimeter of a rectangle 
 * @author Likith
 * @since 30/05/2023
 * @version jdk11
 *
 */
public class PerimeterOfRectangle {

	public static void main(String[] args) {
		System.out.println("enter the length");// enter the value
		Scanner read = new Scanner(System.in);// creating a scanner object for getting input for the user
		int length = read.nextInt();
		System.out.println("enter the Breadth");
		int breadth = read.nextInt();
		int perimeter = 2*length + 2*breadth ;
		System.out.println("PERIMETER: "+perimeter);
		read.close();
		

	}

}
