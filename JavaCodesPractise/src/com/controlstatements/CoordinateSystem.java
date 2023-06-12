package com.controlstatements;

import java.util.Scanner;

/**
 * To read the coordinate System in a xy point
 * @author Likith
 * @since 31/05/2023
 * @version jdk11
 *
 */
public class CoordinateSystem {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		// reading the input from the user
		System.out.println("enter the x value");
		int x = read.nextInt();
		
		System.out.println("enter the x value");
		int y = read.nextInt();
		// provide the condition
		if(x>0 && y>0) {
			System.out.println("it is first quadrant: " + x +" , "+ y);// to check the given value is positive
		}else if( x<0 && y>0) {
			System.out.println("it is second quadrant:" + x +" , "+ y);
		}else if( x<0 && y<0) {
			System.out.println("it is third quadrant:" + x +" , "+ y);
		}else if( x>0 && y<0) {
			System.out.println("it is fourth quadrant:" + x +" , "+ y);
		}else if( x>0 && y==0) {
			System.out.println("it is x positve:" + x +" , "+ y);
		}else if( x<0 && y==0) {
			System.out.println("it is x negative:" + x +" , "+ y);
		}else if( x==0 && y>0) {
			System.out.println("it is x positve:" + x +" , "+ y);
		}else if( x==0 && y<0) {
			System.out.println("it is x negative:" + x +" , "+ y);
		}else {
			System.out.println("it is origin: "+ x +" , "+ y);
		}
		
		read.close();
	
	}

}
