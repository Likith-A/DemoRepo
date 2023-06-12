package com.string;
import java.util.*;
/**
 *To reverse the string by string builder
 * @author Likith
 * @since 06/06/2023
 * @version jdk11
 *
 */
public class StringBulider {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String str1 = scan.nextLine();
		StringBuffer s1 = new StringBuffer(str1);
		s1=s1.reverse();
		System.out.println(s1);
		scan.close();
	}

}
