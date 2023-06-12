package com.javafundas;

import java.util.*;

/**
 * To display the movie details
 * @author 
 * @since 30/05/2023
 * @version jdk11
 *
 */
public class MovieDetails {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);//creating a scanner object for getting input for the user
		System.out.println("enter the name");// enter the name 
		String name = read.next();

		System.out.println("enter the Id");
		int id = read.nextInt();

		System.out.println("enter the descriptive");
		String descriptive = read.next();

		System.out.println("enter the gender");
		String gender = read.next();

		System.out.println("enter the movie language");
		String language = read.next();

		System.out.println("enter the date");
		String date = read.next();

		System.out.println("movie name:" + name);
		System.out.println("movie id: " + id);
		System.out.println("movie descriptive: " + descriptive);
		System.out.println("gender:" + gender);
		System.out.println("movie language:" + language);
		System.out.println("movie Date :" + date);
		read.close();

	}
}
