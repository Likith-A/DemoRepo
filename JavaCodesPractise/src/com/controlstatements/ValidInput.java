package com.controlstatements;

import java.util.Scanner;

/**
 * To get the value of valid input of username and password
 * @author Likith
 * @since 31/05/2023
 * @version jdk11
 *
 */
public class ValidInput {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		// reading the input from the user
		System.out.println("username: ");
		String username = read.next();
		System.out.println("password: ");
		String password = read.next();
		 
		String userName = "Likith200";
		String passWord = "Likith_2001";
		// provide the condition
		if(userName.equals("Likith200")&& passWord.equals("Likith_2001"))
			System.out.println("welcome "+username +"!");
		else
			System.out.println("invalid username or password");
	
		
		
		read.close();
		

	}

}
