package com.controlstmandarray;

/**
 * To order the student height in order
 * @author Likith
 * @version jdk11
 * @since 12/06/2023
 */
import java.util.*;

public class StudentHeigthOrder {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double[] heights = new double[10];

		System.out.println("Enter the heights of 10 students:");

		for (int i = 0; i < 10; i++) {
		heights[i] = read.nextDouble();
		}

		Arrays.sort(heights);

		System.out.println("Students ordered by height:");
		for (double height : heights) {
		System.out.print(height + " ");
		}
		read.close();
	}
}
