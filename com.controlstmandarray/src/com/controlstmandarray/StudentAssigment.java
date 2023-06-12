package com.controlstmandarray;
/**
 * To get student Assignment as by there id's
 * @author Likith
 * @version jdk11
 * @since 12/06/2023
 */
import java.util.*;
public class StudentAssigment {
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numStudents = read.nextInt();
		int[] marks = new int[numStudents];
		System.out.print("Enter the marks of the students: ");
		for (int i = 0; i < numStudents; i++) {
			marks[i] = read.nextInt();
		}
		// Calculate the average score
		int sum = 0;
		for (int i = 0; i < numStudents; i++) {
			sum += marks[i];
		}
		double average = (double) sum / numStudents;
		// Print the student IDs with scores below the average
		System.out.print("Student IDs for extra assignments: ");
		for (int i = 0; i < numStudents; i++) {
			if (marks[i] < average) {
				System.out.print(i + " ");
			}
		}
		read.close();
	}
}
