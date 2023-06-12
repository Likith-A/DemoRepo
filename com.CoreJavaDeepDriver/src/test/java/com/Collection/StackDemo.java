package com.Collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<String>();// stack
		System.out.println("size of the stack is: "+stk.size());// size of the element before of the initialize of the stack
		stk.push("A");
		stk.push("b");
		stk.push("c");
		stk.push("d");
		stk.push("f");
		System.out.println("elements in the stack: "+stk);// print the element in the stack
		System.out.println("size of the stack: "+stk.size());//length of the stack element
		stk.pop();// remove the elements
		System.out.println("element of the stack: "+stk);
		System.out.println("size of the elements: "+stk.size());


	}

}
