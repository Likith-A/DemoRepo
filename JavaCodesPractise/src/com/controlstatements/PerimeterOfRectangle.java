package com.controlstatements;

import java.util.Scanner;

/**
 * To get the perimeter of rectangle
 * @author Likith
 * @since 31/05/2023
 * @version jdk11
 *
 */
public class PerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		// reading the input from the user
		System.out.println("enter the length");
		int length = read.nextInt();
		
		System.out.println("enter the breadth");
		int breadth = read.nextInt();
		int area = length * breadth;
		System.out.println("AREA:" +area);
		int perimeter = 2*length + 2*breadth ;
		System.out.println("PERIMETER: "+perimeter);
		// provide the condition
		if(area>perimeter) {
			System.out.println(area +" area greater than its perimeter");
			
		}else {
			System.out.println(area +" area less than its perimeter");
		}
		read.close();
	

	}

}
