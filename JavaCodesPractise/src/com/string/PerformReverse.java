package com.string;

import java.util.Scanner;

/**
 * To perform the reverse and concate the string
 * @author Likith
 * @since 06/06/2023
 * @version jdk11
 *
 */
public class PerformReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string1");
		String s1 = sc.nextLine();
		System.out.println("enter the string2");
		String s2 = sc.nextLine();
		String s3;
		s3 =s1.concat(s2);
		
		char [] charArray = s2.toCharArray();//to character to array
		String s="";
		for(int i = charArray.length - 1 ; i >= 0 ; i--) {
			s= s2  + charArray[i];
			s=s1+s2;
		}
		System.out.println(s);
		sc.close();


	}

}
