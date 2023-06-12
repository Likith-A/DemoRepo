package com.corejava.deepdive;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * To create an ArrayList for displaying objects in sorted way , insertion of object 
 * @author lsundar
 * @version JDK11
 * @since 8/6/23
 */

class Person {
   private String firstName;
   private String lastName;

   public Person(String firstName, String lastName) {
       this.firstName = firstName;
       this.lastName = lastName;
   }

   public String getFullName() {
       return firstName + " " + lastName;
   }
}

public class ArrayListDisplay {
   //calling main function
   public static void main(String[] args) {
       ArrayList<Person> personList = new ArrayList<>();

       // Adding person objects to the ArrayList
       personList.add(new Person("Priscilla", "Wagner"));
       personList.add(new Person("Tom", "Parker"));
       personList.add(new Person("Elvis", "Presley"));

       // Displaying all person objects
       System.out.println("Array List of Objects:");
       for (Person person : personList) {
           System.out.println(person.getFullName());
       }

       // Number of person objects are displayed
       int count = personList.size();
       System.out.println("Count of Person Objects: " + count);

       //At a position chosen by the user,insertion of a person object
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the person object to insert: ");
       String fullName = sc.nextLine();
       System.out.print("Enter the position to insert: ");
       int position = sc.nextInt();
       sc.nextLine(); // Consuming the newline character

       Person personToInsert = new Person(fullName.split(" ")[0], fullName.split(" ")[1]);
       personList.add(position, personToInsert);

       // After insertion , display the ArrayList in the terminal window
       System.out.println("Array List of Objects after insertion:");
       for (Person person : personList) {
           System.out.println(person.getFullName());
       }
       sc.close();
   }
}