package com.corejava.deepdive;
import java.util.Scanner;
/**
 * To count the number of words in the given sequence
 * @author lsundar
 * @version JDK11
 * @since 8/6/23
 */

public class WordCounter {
	   public static int countWords(String sentence, String word) {
		   //initiating count as zero
	       int count = 0;
	       String[] words = sentence.split(" ");
           //using for loop for counting words
	       for (String w : words) {
	           if (w.equalsIgnoreCase(word)) {
	               count++;
	           }
	       }

	       return count;
	   }

	   public static void main(String[] args) {
		   //getting input from the users using scanner class
		   Scanner sc = new Scanner(System.in);
		   String sentence = sc.nextLine();
		   String word = sc.nextLine();
	       
	       int wordCount = countWords(sentence, word);
	       //displaying result on terminal window
	       System.out.println("Count of the word \"" + word + "\": " + wordCount);
	       sc.close();
	   }
	   
	}