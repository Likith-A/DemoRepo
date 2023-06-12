package com.arraysfunction;

import java.util.Scanner;

public class AssignAndPrint {

	public static void main(String[] args) {
		int a[] = {12,45,43,45,79};
		System.out.println("array element");
		//for loop
		for(int i=0 ; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		// for each
		System.out.println("\n");
		for(int value : a) {
			System.out.print( value +" ");
		}
		int sum=0;
		for(int data : a) {
			sum =sum + data;
		}
		System.out.println("sum "+ sum + "AVERAGE: "+(sum/a.length));
		int average = (sum/a.length);
		System.out.println(" ");
		for (int data : a) {
			if(data > average) {
				System.out.println(data + " ");
			}
		}
		
		// user input
		int[] b = new int[10];
		Scanner read = new Scanner("System.in");
		System.out.println("value of N");
		int n = read.nextInt();
		for(int i =0; i<n ; i++) {
			b[i] = read.nextInt();
		}
		read.close();

	}

}
