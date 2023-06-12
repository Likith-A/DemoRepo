package com.iteration;

import java.util.Scanner;

/**
 * To print the sum of odd number
 * 
 * @author Likith
 * @since 31/05/2023
 * @version jdk11
 *
 */
public class SumOfOddNumber {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter the number");
		int n = read.nextInt();// to print odd number
		int sum=0;
	//	for(int i=1; i<=n;i++) {
	//		if(i%2!=0) {
			//	sum=sum+i;
	//			System.out.println(sum);
	//		}
			
		// to print even number
			for(int i=1; i<=n;i++) {
				if(i%2==0) {
					sum=sum+i;
					System.out.println(sum);
				}

	}
		read.close();

}
}
