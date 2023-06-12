package com.string;

import java.util.Scanner;

/**
 * To replace the order in the character
 * @author Likith
 * @since 06/06/2023
 * @version jdk11
 *
 */
public class ReplaceAll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		// to replace the order of the character
		s= s.replaceAll("[aeio]", "z");
		System.out.println(s);
		sc.close();
		
		
		System.out.println( s.replaceAll("[aeio]", "z"));

	}

}
