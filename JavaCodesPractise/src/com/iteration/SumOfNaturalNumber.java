package com.iteration;

import java.util.Scanner;

/**
 * To print the sum of natural number
 * 
 * @author Likith
 * @since 31/05/2023
 * @version jdk11
 *
 */
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter the number");
		int n = read.nextInt();	
		int sum =0;
		for(int i=1; i<=n;i++) {
			sum=sum+i;
			System.out.println("sum of natural number "+ sum);
		}
		read.close();

	}

}
