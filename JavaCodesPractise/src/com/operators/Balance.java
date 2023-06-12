package com.operators;

import java.util.Scanner;
/**
 * To get the Balance
 * @author Likith
 * @since 30/05/2023
 * @version jdk11
 *
 */

public class Balance {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter the number");// enter the values
		int number = read.nextInt();
		int ten = 10;
		int fifty = 50;
		int hund = 100;
		System.out.println("no of hun rupees notes : " + (number / hund));// displays the output
		System.out.println("no of 50 rs notes : " + ((number % hund) / fifty));
		System.out.println("no of 10rs notes : "+(number%fifty)/ten);

		read.close();

	}

}
