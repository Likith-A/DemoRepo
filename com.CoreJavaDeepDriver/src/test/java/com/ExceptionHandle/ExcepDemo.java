package com.ExceptionHandle;

public class ExcepDemo {

	public static void main(String[] args) {
		try {
			int a[] = new int[2];
			System.out.println("acess the element"+a[3]);

	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("exception thrown"+e); //Index 3 out of bounds for length 2 
	}
		System.out.println("out of the block");

}
}
