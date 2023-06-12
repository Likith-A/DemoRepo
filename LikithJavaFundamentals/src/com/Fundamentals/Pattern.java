package com.Fundamentals;

import java.util.Scanner;

/**
 * to print the patterns
 * @author Likith
 * @version jdk11
 * @since 06/06/2023
 */
public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		for( int i=1;i<=a; i++) {
			for( int j=1;j>=a;j--) {
				System.out.println(" ");
			}
			System.out.println(i);
			sc.close();
		}

	}

}
