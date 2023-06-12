package com.iteration;

import java.util.Scanner;

/**
 * To print the positive negative and zeros
 * 
 * @author Likith
 * @since 31/05/2023
 * @version jdk11
 *
 */
public class PositiveNegativeZeros {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter the value");
		int positive = 0;
		int negative = 0;
		int zero = 0;
		while (true) {
			String value = read.next();
			if(value.equals("Y")) 
				break;
				else {
					int num1 = Integer.parseInt(value);
					if(num1 > 0) {
						positive++;		
					}else if(num1 < 0){
						negative++;
					}else {
						zero++;
					}
				}
			
		}
		System.out.println("count of positive numbers: "+positive);
		System.out.println("count of negative numbers: "+negative);
		System.out.println("count of zero: "+zero);
		read.close();
	}

}
