package com.CoreJavaDeepDriver;

/**
 * To count of the repeated in words
 * @author likith
 * @version jdk11
 * @since 07/06/2023
 */
import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public class Alp {

	public static void main(String[] args) {
		String s = "elephant";// initialize the value
		char[] c = s.toCharArray(); // to convert character to the array
		Arrays.sort(c); //  to sort the elements
		for (int i = 0; i < c.length; i++) {
			int count = StringUtils.countMatches(s, c[i]);
			if (i != c.length - 1 && c[i] == c[i + 1]) {
				continue;
			}
			System.out.println(c[i] + "-" + count);
		}

	}

}
