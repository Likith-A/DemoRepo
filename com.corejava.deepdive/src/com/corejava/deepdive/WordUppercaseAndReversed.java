package com.corejava.deepdive;
import java.util.Scanner;
/**
 * Program for WordUppercase and Reversed
 * @author lsundar
 * @version JDK11
 * @since 8/6/23
 */

public class WordUppercaseAndReversed {
   public static String getSecondWordUppercaseReversed(String sentence) {
       String[] words = sentence.split(" ");
       //using conditional statements for checking the condition
       if (words.length < 2) {
           return "LESS";
       } else {
           String secondWord = words[1].toUpperCase();
           return new StringBuilder(secondWord).reverse().toString();
       }
   }
   
   //calling the main function
   public static void main(String[] args) {
	   //getting input from user
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a sentence: ");
       String sentence = sc.nextLine();

       String result = getSecondWordUppercaseReversed(sentence);
       //displaying the output in terminal window
       System.out.println("Output: " + result);
       sc.close();
   }
}