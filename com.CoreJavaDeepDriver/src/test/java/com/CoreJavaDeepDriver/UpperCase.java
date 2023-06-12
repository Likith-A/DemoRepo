package com.CoreJavaDeepDriver;

public class UpperCase {

	public static void main(String[] args) {
		String s ="protience Technologies Bangalore";
		String[] words = s.split("");
		if(words.length<2) {
			System.out.println("LESS");
		}else {
			for(int i =0;i<words.length; i++) {
				if(i == 1) {
					String uc = words[i].toUpperCase();
					System.out.println(uc);
					StringBuffer sb = new StringBuffer(uc);
					System.out.println(sb.reverse());
					
				}
			}
		}
		

	}

}
