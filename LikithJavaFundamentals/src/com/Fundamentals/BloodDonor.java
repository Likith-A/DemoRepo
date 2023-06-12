package com.Fundamentals;
import java.util.*;
/**
 * Eligible for blood donating or not
 * @author Likith
 * @version jdk11
 * @since 06/06/2023
 */
public class BloodDonor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int  age= sc.nextInt();
		System.out.println("enter the weight");
		int weight= sc.nextInt();
		if((age>= 18)|| weight>=45) {
			System.out.println("eligible for donating");
		}
		else {
			System.out.println("not eligible for donating");
		}
		sc.close();

	}

}
