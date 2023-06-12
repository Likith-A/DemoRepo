package com.string;
/**
 * To print the length of the string
 * @author Likith
 * @since 06/06/2023
 * @version jdk11
 *
 */
import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		System.out.println("length of the string: "+s.length());
		sc.close();

	}

}
