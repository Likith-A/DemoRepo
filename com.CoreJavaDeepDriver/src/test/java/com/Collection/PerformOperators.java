package com.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class PerformOperators {

	public static void main(String[] args) {
		HashMap<String, Integer> studentMarks = new HashMap<String, Integer>();
		studentMarks.put("kishor", 80);
		studentMarks.put("varun", 90);
		studentMarks.put("rohith", 70);
		studentMarks.put("pradeep", 85);
		studentMarks.put("mahendra", 60);
		studentMarks.put("surendran", 95);

		Stack<String>stack=new Stack<String>();
		for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
		if (entry.getValue() > 75) {
		stack.push(entry.getKey());
		}
		}
		System.out.println("elements in stack");
		while (!stack.isEmpty()) {
		System.out.println(stack.pop());
		}

		}
}


