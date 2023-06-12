package com.Collection;

import java.util.Iterator;
import java.util.LinkedList;

class Employee{
	private String empName;// two attribute are in followed by constructor
	private int empId;
	
	public Employee(String empName, int empId) { //  two parameters are passed in the constructor
		super();
		this.empName=empName;
		this.empId=empId;		
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + "]";
	}
}

public class UserDefinedCollection {

	public static void main(String[] args) {
		LinkedList<Employee> emp = new LinkedList<Employee>();
		
		//add the elements to the listed list
		emp.add(new Employee("ravi",123));
		//display the details
		for(Employee ep:emp) {
			System.out.println(ep);
		}
		System.out.println("display through the iterator");
		
		Iterator<Employee> iter = emp.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
