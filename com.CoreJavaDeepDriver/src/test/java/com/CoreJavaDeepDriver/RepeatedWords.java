package com.CoreJavaDeepDriver;

/**
 * To count the repeated in words in the sentences
 * @author likith
 * @version jdk11
 * @since 07/06/2023
 */
//import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class RepeatedWords {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the sentences");
		String s1 = s.next();		
		
		int count = StringUtils.countMatches(s1, "technology");
		System.out.println("technology"+"-"+count);
		s.close();
 			
		}

	}
