package com.Collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		System.out.println("size of the hashset "+hs.size());
		// adding the elements to the hashset
		hs.add("ravi");
		hs.add("son");
		hs.add("loc");
		hs.add("ravi");
		hs.add("alpha");
		hs.add("beta");
		hs.add("lax");
		System.out.println("elements in the hashset: "+hs);
		System.out.println("length of the elements: "+hs.size());
		
		hs.remove("ravi");
		System.out.println("elements in the hashset: "+hs);
		System.out.println("length of the elements: "+hs.size());

	}

}
