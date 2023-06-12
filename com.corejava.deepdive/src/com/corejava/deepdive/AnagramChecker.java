package com.corejava.deepdive;
import java.util.Scanner;
import java.util.Arrays;
/**
 * To check whether the two strings are anagram or not
 * @author lsundar
 * @version JDK11
 * @since 8/6/23
 */

public class AnagramChecker {
   public static boolean isAnagram(String a, String b) {
       // Removing whitespace and converting it to lowercase
       a = a.replaceAll("\\s", "").toLowerCase();
       b = b.replaceAll("\\s", "").toLowerCase();

       // Verify if the lengths are equal
       if (a.length() != b.length()) {
           return false;
       }

       // Convert strings to character arrays then sort them
       char[] aChars = a.toCharArray();
       char[] bChars = b.toCharArray();
       Arrays.sort(aChars);
       Arrays.sort(bChars);

       // Compare the character arrays which are sorted
       return Arrays.equals(aChars, bChars);
   }
   
   public static void main(String[] args) {
	   //getting inputs from users
	   Scanner sc = new Scanner(System.in);
	   String a = sc.nextLine();
	   String b =sc.nextLine();
       //using conditional statements to check if it is anagram or not
       if (isAnagram(a, b)) {
           System.out.println("Anagrams");
       } else {
           System.out.println("Not Anagrams");
       }
       sc.close();
   }
}