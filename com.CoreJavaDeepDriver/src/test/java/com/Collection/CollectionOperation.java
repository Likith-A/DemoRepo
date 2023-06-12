package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionOperation {
    public static void displayStrings(ArrayList<String> al) {
        System.out.println("DISPLAYING THE ARRAYLIST COLLECTIONS");
        System.out.println("*************************");
        Iterator<String> iterstr = al.iterator();
        while (iterstr.hasNext()) {
            System.out.println(iterstr.next());

        }
    }
    
    public static void capitalstrings(ArrayList<String> al) {
        System.out.println("\ncapitalized Strings");
        for (String word : al) {
            char ch = word.charAt(word.length() - 1);
            System.out.println(ch);
            if (ch == 's') {
                System.out.println((Character.tostring(word.charAt(0)).toUpperCase()) + word.substring(1) + " ");
            }
        }
    }

    public static void displaywithoutplurals(ArrayList<String>al) {
        System.out.println("\nWithoutPluralString");
        ListIterator<String> stringIter = al.listIterator();
        while(stringIter.hasNext()) {

 
        }
    }

    public static void reverseWords(ArrayList<String>al) {

        System.out.println("\n\nReversed String");

        for(String word : al) {

            System.out.println(new StringBuffer(word).reverse());

        }
    }       

    public static void main(String[] args) {
        ArrayList<String> Arr = new ArrayList<String>();

        Arr.add("WORDS");

        Arr.add("HELLO");

        Arr.add("DAYS");

        Arr.add("TEACHERS");

    }

}
