package com.controlstatements;
 /**
 * eligible to vote or not
 * @author Likith
 * @since 30/05/2023
 * @version jdk11
 *
 */
import java.util.Scanner;

public class EligibleToVote {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		// reading the input from the user
		System.out.println("ENTER THE AGE");
		int age = read.nextInt();
		// provide the condition
		if(age>=0) {
			System.out.println("INVALID AGE");
		}
		if(age>=18) {
			System.out.println(age + " eligible for vote");
		}else {
			int diff =(18-age);
			System.out.println("you are not eligible for vote, it after "+ diff + " years");
		}
		
		
		read.close();
	

	}

}
