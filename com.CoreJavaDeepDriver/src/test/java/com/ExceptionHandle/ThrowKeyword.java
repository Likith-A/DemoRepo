package com.ExceptionHandle;

public class ThrowKeyword {
	static void validate(int num) {
		if(num<0) {
			throw new ArithmeticException("invalid num");
		}else {
			System.out.println("valid to proceed");
		}
	
	}
	public static void main(String[] args) {
		try {
			validate(-10);
			
		}
		catch(Exception e){
			System.out.println("error:"+e);
		}
		System.out.println("rest of the code..........");

	}

}
