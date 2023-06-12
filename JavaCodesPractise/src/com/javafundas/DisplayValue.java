package com.javafundas;

/**
 * 
 * @author Likith
 * @since 30/05/2023
 * @version jdk 11
 *
 */
public class DisplayValue {

	public static void main(String[] args) {
		int number1=1;//declare the values
		int number2=2;
		int number3=3;
		int number4=1000;
		System.out.println("number1: "+number1);//display the values
		System.out.println("number2: "+number2);
		System.out.println("number3: "+number3);
		System.out.println("number4: "+number4);
		System.out.println("after re-assign the values");
		
		number4= number3;// re-assign the values
		number3= number2;
		number2= number1;
		number1= 100;
		System.out.println("number1: "+number1);// display the values
		System.out.println("number2: "+number2);
		System.out.println("number3: "+number3);
		System.out.println("number4: "+number4);

	}

}
