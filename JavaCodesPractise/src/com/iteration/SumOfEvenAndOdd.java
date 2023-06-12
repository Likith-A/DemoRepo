package com.iteration;

import java.util.Scanner;

/**
 * To print the sum of even and odd number
 * 
 * @author Likith
 * @since 31/05/2023
 * @version jdk11
 *
 */
public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter the number");
		int num = read.nextInt();
		int oddSum = 0;
		int evenSum = 0;
		for(int i = 1; i<=num; i++) {
			if (i%2 == 1) {
				oddSum = oddSum +i;
				
			}else if(i%2==0) {
				evenSum = evenSum +i;
								
			}
			
		}
		System.out.println("evensum: "+ evenSum);
		System.out.println("oddsum: "+ oddSum);
		read.close();

	}

}
