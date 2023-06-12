package com.iteration;

import java.util.Scanner;

/**
 * To print the divisible by 2 and 4 
 * 
 * @author Likith
 * @since 31/05/2023
 * @version jdk11
 *
 */
public class DivisibleNumber {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter the number");
		int n = read.nextInt();		
		for(int num=1; num<=n; num++) {
			if((num %2 == 0)&& (num % 4 ==0)) {
				
				System.out.println(num);
			}
		}
		read.close();
	}

}
