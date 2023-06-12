package com.iteration;

import java.util.Scanner;

/**
 * To print the factor of the number
 * 
 * @author Likith
 * @since 31/05/2023
 * @version jdk11
 *
 */
public class Factor {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter the number");
		// to print the factor of the number
		int n = read.nextInt();	
		int i=1;
		
		while(i<=n/2) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		read.close();

	}

}
