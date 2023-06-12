package com.arraysfunction;

import java.util.Arrays;
/**
 * To read the value from array and sort
 * @author Likith
 * @since 30/05/2023
 * @version jdk11
 *
 */

public class MinMax {

	public static void main(String[] args) {
		
		int a[] = {12,45,34,78,89,11,22,55,77,88};
		Arrays.sort(a);
		for(int i :a) {
			System.out.println(i + " ");
		}	

	}

}
