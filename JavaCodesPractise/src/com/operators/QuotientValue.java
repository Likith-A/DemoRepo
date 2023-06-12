package com.operators;

import java.util.*;
/**
 * To print the following expression
 * @author Likith
 * @since 30/05/2023
 * @version jdk11
 *
 */
public class QuotientValue {

	public static void main(String[] args) {
		System.out.println("enter the number");// enter the value
		Scanner read = new Scanner(System.in);
		int  number = read.nextInt();
		System.out.println((((number+8)/3)%5)*5);
		read.close();

	}

}
