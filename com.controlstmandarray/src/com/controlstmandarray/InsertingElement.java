package com.controlstmandarray;

/**
* program to accept n numbers from console and then insert an element at the specified position of the array
* @author Likith
* @since 12/06/2023
*/
import java.util.Scanner;

public class InsertingElement {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = read.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = read.nextInt();
		}
		System.out.print("Enter the element to insert: ");
		int ele = read.nextInt();
		System.out.print("Enter the position to insert at: ");
		int position = read.nextInt();
		// Create a new array with increased size
		int[] newArray = new int[size + 1];
		// Copy elements to the new array up to the specified position
		for (int i = 0; i < position; i++) {
			newArray[i] = arr[i];
		}
		// Insert the element at the specified position
		newArray[position] = ele;
		// Copy remaining elements to the new array
		for (int i = position + 1; i < newArray.length; i++) {
			newArray[i] = arr[i - 1];
		}
		// Print the modified array
		System.out.print("Modified array: ");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
		read.close();
	}
}