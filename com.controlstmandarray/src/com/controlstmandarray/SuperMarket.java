package com.controlstmandarray;
/**
 * To display values in the array by the entering the index
 * @author Likith
 * @version jdk11
 * @since 12/06/2023
 */
import java.util.*;

public class SuperMarket {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.print("Enter the number of customers: ");
		int numCustomers = read.nextInt();

		String[] customers = new String[numCustomers];
		System.out.print("Enter the names of the customers: ");
		for (int i = 0; i < numCustomers; i++) {
			customers[i] = read.next();
		}

		System.out.print("Enter the name of the customer to find: ");
		String customerToFind = read.next();

		// Search for the customer and determine their position
		int position = -1;
		for (int i = 0; i < numCustomers; i++) {
			if (customers[i].equalsIgnoreCase(customerToFind)) {
				position = i + 1; // Position starts from 1, not 0
				break;
			}
		}

		// Print the position of the customer
		System.out.println("Position of the customer: " + position);
		read.close();
	}
}