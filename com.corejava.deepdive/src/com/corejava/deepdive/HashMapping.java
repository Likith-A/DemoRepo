package com.corejava.deepdive;
import java.util.HashMap;
import java.util.Map;
/**
 * Creating collection called HasMap ,capable of storing Objects
 * @author lsundar
 * @version JDK11
 * @since 8/6/23
 */

public class HashMapping {
   //calling the main function
   public static void main(String[] args) {
       // Creating a collection named as HashMap
       HashMap<String, String> phoneBook = new HashMap<>();

       // Add the key-value pairs to the HashMap
       phoneBook.put("Bhairavi", "9840832921");
       phoneBook.put("Sahana", "9884860625");
       phoneBook.put("Vasantha", "6374598213");
       phoneBook.put("Amirthavarshini", "9840152121");

       // Verifying if a particular key exists or not 
       String searchKey = "Bhairavi";
       if (phoneBook.containsKey(searchKey)) {
           System.out.println(searchKey + " exists in the phone book.");
       } else {
           System.out.println(searchKey + " does not exist in the phone book.");
       }

       // Verifying if a particular value exists or not
       String searchValue = "9840800555";
       if (phoneBook.containsValue(searchValue)) {
           System.out.println(searchValue + " exists in the phone book.");
       } else {
           System.out.println(searchValue + " does not exist in the phone book.");
       }

       // Using for-each loop, iterating through the Map Entry Set
       System.out.println("Phone Book Details:");
       for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
           String name = entry.getKey();
           String phoneNumber = entry.getValue();
           System.out.println(name + " - " + phoneNumber);
       }
   }
}