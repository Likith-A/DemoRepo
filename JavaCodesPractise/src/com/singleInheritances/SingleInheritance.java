package com.singleInheritances;
/**
 * To create the employee class by using single inheritance
 * @author Likith
 * @since 03/06/2023
 * @version jdk11
 *
 */

// base class employee
class Emp{
	int empId;
	String empName;
	
	public void setData(int empId,String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	public void getData(){
		System.out.println("Employee Id: "+ empId +"|"+ "EmployeeName: "+ empName);
	}	
}
//Derived Class Manager
class Manager extends Emp{
	String empDept;

	public void getDept() {
		System.out.println("Employeen Department: "+ empDept);
	}

	public void setDept(String empDept) {
		this.empDept = empDept;
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setData(123,"alex");
		manager.setDept("QA");
		manager.getData();
		manager.getDept();

	}

}
