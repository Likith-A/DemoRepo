package com.operators;

import java.util.*;
/**
 * To check the both the condition 
 * @author Likith
 * @since 30/05/2023
 * @version jdk11
 *
 */
public class CheckCondition {

	public static void main(String[] args) {
		System.out.println("enter the number");// enter the value
		Scanner read = new Scanner(System.in);
		int a= read.nextInt();
		System.out.println("enter the number");
		int b= read.nextInt();
		System.out.println(a<50 && a<b);//check the condition and print
		a=60;
	    b=70;
	    System.out.println(a<50 || a<b);		
	    read.close();

	}

}
