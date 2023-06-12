package com.arraysfunction;

import java.util.Scanner;

public class CalculateSalary {
	
	public static double salary(double currentsalary, double hike) {
		double hikeamount = currentsalary * (hike/100); 
		double newsalary = currentsalary +  hikeamount;
		return newsalary;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter the currentSalary");
		double currentsalary = read.nextDouble();
		System.out.println("enter the hike");
		double hike = read.nextDouble();
		double newsalary = salary(currentsalary,hike);
		System.out.println("hikeamount"+ newsalary);
		
		
		read.close();
 
	}

}
