package com.Collection;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// create an integer list
		ArrayList<Integer> i = new ArrayList<Integer>();
		System.out.println("initial size of the integer list: " + i.size());
		i.add(1);
		i.add(21);
		i.add(34);
		i.add(45);
		i.add(55);
		i.add(21);
		System.out.println("contents of ArrayList" + i);
		System.out.println("size of the integer list: " + i.size());
		// remove the element
		i.remove(3);
		System.out.println("contents of Integer LIST" + i);

		System.out.println(i.contains(45));// present in the integer list or not

		Integer a[] = new Integer[i.size()];
		a = i.toArray(a);
		int sum = 0;
		for (int num : a) {
			sum += num;
		}
		System.out.println("sum value is: " + sum);

		Iterator<Integer> iter = i.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
