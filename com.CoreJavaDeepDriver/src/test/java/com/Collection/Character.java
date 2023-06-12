package com.Collection;


import java.util.*;

public class Character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> names = new ArrayList<>();// array list
		System.out.print("How many names: ");
		int count = sc.nextInt(); // count the element
		for (int i = 1; i <= count; i++) {
		System.out.print("Give name " + i + ": ");
		String name = sc.next();
		names.add(name);
		}
		System.out.println("Names longer than 5 characters:");
		for (String name : names) {
		if (name.length() > 5) {
		System.out.println(name);
		}
		sc.close();
		}
		}

}
