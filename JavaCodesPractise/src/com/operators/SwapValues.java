package com.operators;

/**
 * To swap the number
 * @author Likith
 * @since 30/05/2023
 * @version jdk11
 *
 */
public class SwapValues {

	public static void main(String[] args) {
		System.out.println("SWAP WITH THE HELP OF THIRD VARIABLE");
		int a=6;
		int b=9;
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		System.out.println("SWAP WITH OUT THRID VARIABLE");
		int c=10;
		int d=2;
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println(c);
		System.out.println(d);
		System.out.println("SWAP WITH XOR OPERATION");
		int x=10;
		int y=2;
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println(x);
		System.out.println(y);
		

	}

}
