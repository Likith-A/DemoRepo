package com.string;
/**
 * To concat the two string
 * @author Likith
 * @since 06/06/2023
 * @version jdk11
 *
 */
import java.util.Scanner;

public class Contact {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string1");
		String s1 = sc.nextLine();
		System.out.println("enter the string2");
		String s2 = sc.nextLine();
		String s3 = s1.concat(s2);// prints the concated of the two string
		System.out.println("concat of the string: "+ s3 );
		sc.close();

	}

}
