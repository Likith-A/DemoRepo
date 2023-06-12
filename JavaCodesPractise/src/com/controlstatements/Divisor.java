package com.controlstatements;

import java.util.Scanner;

/**
 * To check wheather the number is divisible of 7
 * @author Likith
 * @since 31/05/2023
 * @version jdk11
 *
 */
public class Divisor {

	public static void main(String[] args) {
		Scanner read =  new Scanner(System.in);
		// reading the input from the user
		System.out.println("enter the number");
		// provide the condition
		int a = read.nextInt();
		if(a%7==0) {
			System.out.println(a + " number is divisible by 7");
		}else {
			System.out.println(a + " number is not divisible by 7");
		}
		read.close();
	}

}
