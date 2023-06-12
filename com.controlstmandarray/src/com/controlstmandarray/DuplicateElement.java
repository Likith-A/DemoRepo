package com.controlstmandarray;
/**
 * To find the duplicates elements from the array
 * @author Likith
 * @version jdk11
 * @since 12/06/2023
 */
import java.util.*;
public class DuplicateElement {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.print("Enter the elements of the array: ");
		String input = read.nextLine();
		String[] elements = input.split(" ");

		// Create a HashSet to store unique elements
		Set<String> uniqueElements = new HashSet<>();

		// Create a HashSet to store duplicate elements
		Set<String> duplicateElements = new HashSet<>();

		for (String element : elements) {
		if (!uniqueElements.add(element)) {
		duplicateElements.add(element);
		}
		}

		// Check if there are any duplicate elements
		if (duplicateElements.isEmpty()) {
		System.out.println("-1"); // No duplicates found
		} else {
		System.out.println("Duplicate elements: " + duplicateElements); // Print the duplicate elements
		}

		read.close();
		}
		}
