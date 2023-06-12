package com.singleInheritances;
// Method overloading Demo - polymorphism
public class PolyMethodOverloading {
	
	static int add(int first,int second) {
		return first+second;
	}
	static double add(double first,double second) {
		return first+second;
	}
	static char add(char first,char second) {
		return (char)(first+second);
	}
	static String add(String first,String second) {
		return first.concat(second);
	}
	static float add(float first,float second) {
		return first+second;
	}

	public static void main(String[] args) {
		System.out.println("Adding two integers: "+add(2,3));
		System.out.println("Adding two double "+add(7.0,9.0));
		System.out.println("adding two char: "+add('2','3'));
		System.out.println("Adding two String :"+add("add","add"));
		System.out.println("Adding two float: "+add(2.3,3.0));

	}

}
