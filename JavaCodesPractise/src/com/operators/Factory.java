package com.operators;
import java.util.Scanner;

/**
 * To assigning values to the variables
 * @author A Likith
 * @since 30/05/2023
 * @version jdk11
 *
 */
public class Factory {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter the number");// enter the value
		int num1 = read.nextInt();
		System.out.println("enter the number");
		int num2 = read.nextInt();
		int num = num1 + num2;
		System.out.println("Sample output:"+num);// display the sum of the value
		read.close();
		

	}

}
