package com.iteration;

import java.util.Scanner;

/**
 * To print the sum of digits of a given number
 * 
 * @author Likith
 * @since 31/05/2023
 * @version jdk11
 *
 */
public class SumOfDigit {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter the number");
		int n = read.nextInt();	
		int sum=0;
		while(n%10>0) {
			int last = n%10;
			sum=sum+last;
			n=n/10;			
		}
		System.out.println("sum of given value is :"+ sum);
		read.close();
	}
	

}
