package com.controlstmandarray;
/**
 * To arrange the number in positive an negative
 * @author Likith
 * @version jdk11
 * @since 12/06/2023
 */
import java.util.*;

public class PositiveNegativeArrangment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		// Rearrange the elements
		int positiveIndex = 0;
		int negativeIndex = size - 1;
		while (positiveIndex < negativeIndex) {
			if (arr[positiveIndex] < 0 && arr[negativeIndex] > 0) {
				int temp = arr[positiveIndex];
				arr[positiveIndex] = arr[negativeIndex];
				arr[negativeIndex] = temp;
			}
			if (arr[positiveIndex] >= 0) {
				positiveIndex++;
			}
			if (arr[negativeIndex] < 0) {
				negativeIndex--;
			}
		}
		// Print the arranged array
		System.out.print("Arranged array: ");
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		sc.close();
	}

}