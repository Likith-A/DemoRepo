package com.ExceptionHandle;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e) {
			System.out.println("exception thrown"+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("exception thrown"+e);
		}
		catch(Exception e) {//handler
			System.out.println("exception thrown"+e);
		}
		

}
}
