package com.ExceptionHandle;

public class ThrowsExecp {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());	
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());// it gives desc
		}
		System.out.println("rest of the code");// rest of the code 

	}

}
