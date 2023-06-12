package com.string;

import java.util.Scanner;

/**
 * To accpect the lower and uppercase
 * @author Likith
 * @since 06/06/2023
 * @version jdk11
 *
 */
public class LowerAndUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		// to upper and lowercase
		
		String s1=s.toLowerCase();
		System.out.println(s1);
		
		String s11=s.toUpperCase();
		System.out.println(s11);
		sc.close();

	}

	
		
	}


