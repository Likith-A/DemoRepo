package com.javafundas;

import java.util.*;

public class GreetUser {
	
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in); //creating a scanner object for getting input for the user
		System.out.println("please enter the user name");
		String userName =read.next();
		
		System.out.println("hello "+ userName +"!!!");
		
		read.close();
		
	}

}
