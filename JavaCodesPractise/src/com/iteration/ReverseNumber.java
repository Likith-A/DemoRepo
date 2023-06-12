package com.iteration;
import java.util.Scanner;

/**
 * To print ReverseNumber
 * 
 * @author Likith
 * @since 31/05/2023
 * @version jdk11
 *
 */
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter the number");
		int n= read.nextInt();
		int rem = 0;
		int rev = 0;
		while(n!=0) {
			
			rem = n%10;
			rev = rev*10 + rem;
			System.out.print(rem);
			n=n/10;
			
		}
		read.close();

	}

}

