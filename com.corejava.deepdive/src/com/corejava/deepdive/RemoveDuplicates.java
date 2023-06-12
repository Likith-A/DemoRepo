package com.corejava.deepdive;
import java.util.Scanner;
import java.util.HashSet;
/**
 * To print String after removing duplicates from the given String
 * @author lsundar
 * @version JDK11
 * @since 8/6/23
 */

public class RemoveDuplicates {
   // calling main function
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   //getting inputs from users
	   String input1 = sc.nextLine();
	   String input2 = sc.nextLine();
      
       String output1 = removeDuplicates(input1);
       String output2 = removeDuplicates(input2);
       //for displaying outputs on the terminal window
       System.out.println("Sample Output 1: " + output1);
       System.out.println("Sample Output 2: " + output2);
       sc.close();
   }
   

   public static String removeDuplicates(String str) {
       HashSet<Character> set = new HashSet<>();
       StringBuilder result = new StringBuilder();
       
       for (int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);
           if (!set.contains(ch)) {
               set.add(ch);
               result.append(ch);
           }
       }

       return result.toString();  
       
   }

}