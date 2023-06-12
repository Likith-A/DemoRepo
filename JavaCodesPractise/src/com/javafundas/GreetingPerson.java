package com.javafundas;

import java.util.Scanner;
/**
 * To read the value from the console and greet the user
 * @author Likith
 * @since 30/05/2023
 * @version jdk11
 *
 */
public class GreetingPerson {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);// creating a scanner object for getting input for the user
		System.out.print("enter the name");// enter the name
		String name1 = read.next();
		System.out.print("enter the name");
		String name2 = read.next();
		System.out.println("welcome "+name1 +  "!" +"welcome "+ name2 +" too!" );// displaying the output
		
		read.close();

	}

}
