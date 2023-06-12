package com.Patterns;

import java.util.*;
public class SqaurePattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int i,j;
		for( i=0; i<n; i++) {
			for( j=0; j<n; j++) {
				System.out.print(" * ");
			}
			System.out.println("  ");
		}

	}
}
