package com.operators;

import java.util.*;
/**
 * To find the Cube of the number
 * @author Likith
 * @since 30/05/2023
 * @version jdk11
 *
 */
public class CubeOfNumber {

	public static void main(String[] args) {
		
		System.out.println("enter the number");// enter the value
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int number = n*n*n;
		System.out.println("cube of number "+ number);// display the number
		read.close();

	}

}
