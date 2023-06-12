package com.CoreJavaDeepDriver;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s ="Remove Duplicates";
		String j ="";
		char [] c = s.toCharArray();
		
		for(int i = 0; i<c.length;i++) {
			if(j.indexOf(c[i]) == -1 ){
				i = i + c[i];
			}
		}
		System.out.println(j);
		
	}

}
