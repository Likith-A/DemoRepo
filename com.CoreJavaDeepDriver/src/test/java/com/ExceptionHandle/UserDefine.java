package com.ExceptionHandle;

class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		super(s);
	}
}
class UserDefine{
	static void validate(int age)throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("not eligible");
		else
			System.out.println("eligibl;e");
	}
	public static void main(String[] args) {
		try {
			validate(-13);
		}		
		catch(Exception e) {
					System.out.println("exception: "+e);
		}
		System.out.println("rest of the code.");

	}

}
