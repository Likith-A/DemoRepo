package com.Fundamentals;

import java.util.Scanner;

/**
 * The Given Number is ArmStrong or not
 * @author Likith
 * @version jdk11
 * @since 06/06/2023
 */
public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int t = n;
		int length = 0;
		int sum=0;
		while(t!=0) {
			t=t/10;
			length++;
		}
		
		while(n!=0) {
			sum=sum+(int)Math.pow(n%10,length);
			n=n/10;
		}
		System.out.println("it is a lucky Number: ");
		sc.close();

	}
	

}
