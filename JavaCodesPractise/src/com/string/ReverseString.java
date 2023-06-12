package com.string;
/**
 * To Reverse the string
 * @author Likith
 * @since 06/06/2023
 * @version jdk11
 *
 */
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		// to char array
		
		char [] charArray = s.toCharArray();//to character to array
		String join=" ";
		for(int i = charArray.length - 1 ; i >= 0 ; i--) {
			join= join  + charArray[i];
		}
		System.out.println(join);
		sc.close();
		

	}

}
