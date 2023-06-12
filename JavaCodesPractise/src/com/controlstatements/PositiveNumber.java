package com.controlstatements;
import java.util.*;
/**
 * To print greater or smaller number
 * @author Likith
 * @since 31/05/2023
 * @version jdk11
 *
 */
public class PositiveNumber {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);// reading the input from the user
		System.out.println("enter the number");
		int a = read.nextInt();
		//provide the condition
		if(a>0) {
		System.out.println(a + " number is postive");
		}else {
			System.out.println(a +" number is negative");
		}
		
		
		read.close();

	}

}
