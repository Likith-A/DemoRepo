package com.string;
import java.util.*;

/**
 * To perform the start with and end with method of the string
 * @author Likith
 * @since 06/06/2023
 * @version jdk11
 *
 */
public class StartWithEndWith {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s = sc.nextLine();
//		String s ="aakk.mail.com";
//		System.out.println(s.startsWith("aak"));
//		System.out.println(s.endsWith(".com"));
		if(s.startsWith(s)) {
			System.out.println("it is valid" );
		}
		else{
				System.out.println("it is not valid");
			}
		sc.close();
		
	}

}
