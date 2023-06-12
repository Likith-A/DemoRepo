package com.string;

import java.util.Scanner;
/**
 * To print the given string is palindrome or not
 * @author Likith
 * @since 06/06/2023
 * @version jdk11
 *
 */
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		// to char array
		
		char [] charArray = s.toCharArray();//to character to array
		String join="";
		for(int i = charArray.length - 1 ; i >= 0 ; i--) {
			join= join  + charArray[i];
		}
		System.out.println(join);
		if(s.equalsIgnoreCase(join)) {
			System.out.println("is a palindrome");
		}
		else {
			System.out.println("is not palindrome");
		}
		
	
		sc.close();

	}

}
