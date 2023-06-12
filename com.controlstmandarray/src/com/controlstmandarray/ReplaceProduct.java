package com.controlstmandarray;
/**
 * To find pair of elements in the array having sum of 10
 * @author Likith
 * @version jdk11
 * @since 12/06/2023
 */
import java.util.*;
public class ReplaceProduct {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = read.nextInt();

		System.out.println("Enter the elements of the array separated by spaces:");
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = read.nextInt();
		}

		int[] result = replaceWithProduct(array);

		System.out.println("Modified array with product of other elements:");
		//iterate with for loop
		for (int num : result) {
			System.out.print(num + " ");
			read.close();
		}
	}

	public static int[] replaceWithProduct(int[] array) {
		int[] result = new int[array.length];

		// Calculate the total product of all elements in the array
		int totalProduct = 1;
		for (int num : array) {
			totalProduct *= num;
		}

		// Replace each element with the product of all other elements
		for (int i = 0; i < array.length; i++) {
			result[i] = totalProduct / array[i];
		}

		return result;
	}
}
