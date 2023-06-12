package com.Fundamentals;

import java.util.Scanner;

/**
 * Divisible of 3 or 7 by using Array
 * @author Likith
 * @version jdk11
 * @since 06/06/2023
 */
public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMNER ");
		int[] number = {3,7,9,12,15,19,21,25,56,45,32,98,42,99,100};
		for(int num :number) {
			if(num % 3 == 0 || num % 7 ==0) {
				System.out.print(num);
			}
		sc.close();
				
		}

	}

}
