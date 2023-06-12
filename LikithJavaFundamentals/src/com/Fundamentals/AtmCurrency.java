package com.Fundamentals;

import java.util.Scanner;
/**
 * Atm currency 
 * @author Likith
 * @version jdk11
 * @since 06/06/2023
 */
public class AtmCurrency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount");
		int amn = sc.nextInt();
		if(amn % 500 == 0 ) {
			System.out.println("valid amount! transaction is process");
		}else {
			System.out.println("please enter the amount multiple of 500");
		}
		sc.close();
	}

}
