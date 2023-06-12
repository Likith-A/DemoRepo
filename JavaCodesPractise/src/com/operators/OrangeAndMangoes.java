package com.operators;
import java.util.Scanner;

/**
 * To calculate the total number of student likes oranges and Mangoes
 * @author A Likith
 * @since 30/05/2023
 * @version jdk11
 *
 */
public class OrangeAndMangoes {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter No. of girls like oranges");
		int goranges = read.nextInt();
		
		System.out.println("enter No. of girls like Mangoes");
		int gmangoes = read.nextInt();
		
		System.out.println("enter No. of boys like oranges");
		int boranges = read.nextInt();
		
		System.out.println("enter No. of boys like Mangoes");
		int bmangoes = read.nextInt();
		
		System.out.println("total students like oranges: "+(goranges+boranges));
		System.out.println("total students like Mangoes: "+(gmangoes+bmangoes));
		System.out.println("total students: "+(goranges+gmangoes+boranges+bmangoes));
		System.out.println((gmangoes+goranges)>(boranges+bmangoes));
		read.close();
		
	}
}