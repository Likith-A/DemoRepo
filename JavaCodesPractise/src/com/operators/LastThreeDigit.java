package com.operators;

import java.util.Scanner;

/**
 * To display the last three digit
 * @author Likith
 * @since 30/05/2023
 * @version jdk11
 *
 */
public class LastThreeDigit {

	public static void main(String[] args) {
		System.out.println("enter the number");// enter the value
		Scanner read= new Scanner(System.in);
		int number = read.nextInt();
		System.out.println((number%10)+""+((number/10)%10)+((number/100)%10));
		read.close();

	}

}
