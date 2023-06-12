package com.arraysfunction;
/**
* eligible to vote or not
* @author Likith
* @since 30/05/2023
* @version jdk11
*
*/
import java.util.Scanner;

public class VotingFunction {
	public static boolean isEligible(int age) {
		if (age >= 18)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Read age:");
		int age = read.nextInt();
		boolean check = isEligible(age);
		if(check)
			System.out.println("is eligible for voting");
		else
			System.out.println("not eligible for voting");
		
		read.close();

	}

}
