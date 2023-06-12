package com.arraysfunction;

import java.util.Scanner;
/**
 * To get the repeated number from an array  //1 5 2 3
 * @author Likith
 * @since 30/05/2023
 * @version jdk11
 *
 */
public class RepeatedNumber {

	public static void main(String[] args) {
		int[] b = new int[25];
		Scanner read = new Scanner("System.in");
		System.out.println("value of N");
		int n = read.nextInt();
		for(int i =0; i<n ; i++) {
			b[i] = read.nextInt();
			
			read.close();

	}

}
}