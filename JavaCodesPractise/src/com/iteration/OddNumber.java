package com.iteration;

import java.util.*;

/**
 * To print the odd and even number by using for loop
 * 
 * @author Likith
 * @since 31/05/2023
 * @version jdk11
 *
 */
public class OddNumber {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter the number");
		int n = read.nextInt();
	//	for(int count = 1 ; count <= n ; count++) {
	//		if(count % 2!= 0) {
	//			System.out.println(count + " ");
	//		}
	//	}
		for(int count = 1 ; count <= n ; count++) {
			if(count % 2!= 1) {
				System.out.println(count + " ");
			}
			read.close();
	}
}
}
	
