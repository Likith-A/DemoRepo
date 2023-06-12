package com.controlstmandarray;
/**
 * To get missing element in the array
 * @author Likith
 * @version jdk11
 * @since 12/06/2023
 */
import java.util.*;
public class MissingElement {
		public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		//getting input from the user

		System.out.print("Enter the size of the array: ");
		int size = read.nextInt();

		int[] arr = new int[size - 1];
		System.out.print("Enter the elements of the array: ");
		for (int i = 0; i < size - 1; i++) {
		arr[i] = read.nextInt();
		}

		// Calculate the sum of numbers from 1 to N
		int sum = (size * (size + 1)) / 2;

		// Subtract each element in the array from the sum
		for (int i = 0; i < size - 1; i++) {
		sum -= arr[i];
		}

		// The remaining sum is the missing element
		int missingElement = sum;

		// Print the missing element
		System.out.println("Missing element: " + missingElement);
		read.close();
		}
		}