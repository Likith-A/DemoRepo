package com.arraysfunction;
/**
 * 
 * @author Likith
 * @since 30/05/2023
 * @version jdk11
 *
 */
public class ProductOfArray {

	public static void main(String[] args) {
		int a[] = {12,45,43,45,79};	
		
		// for each			
				int sum=0;
				for(int data : a) {
					sum = sum+data;
				}
				int Product = 1;
				for(int data : a) {
					Product =Product * data;					
				}
				System.out.println("Product"+  Product);				
				System.out.println("sum : "+sum+ "average:"+(sum/a.length));
}
}
