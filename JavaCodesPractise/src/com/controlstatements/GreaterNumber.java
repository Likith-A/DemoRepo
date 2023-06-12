package com.controlstatements;

import java.util.Scanner;

/**
 * To print greater or smaller number
 * @author Likith
 * @since 31/05/2023
 * @version jdk11
 *
 */
public class GreaterNumber {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		// reading the input from the user
		//System.out.println("please don't enter the same values");
		System.out.println("enter the number");
		int a = read.nextInt();
		System.out.println("enter the number");
		int b = read.nextInt();
		
		// provide the condition
		//if..else conditon
	//	if (a > b) {
	//		System.out.println(a + " is greater than " + b);
	//	} else {
	//		System.out.println(b + " is greater than " + a);
	//	}
		// nested if..else condition
		if(a > 0 && b > 0 && a!=b) {
			
			if (a > b) {
				System.out.println(a + " is greater than " + b);
			} else {
				System.out.println(b + " is greater than " + a);
			}
		}else {
			System.out.println("please enter values greater than zero and both number should not be same");
		}
		read.close();

	}

}
