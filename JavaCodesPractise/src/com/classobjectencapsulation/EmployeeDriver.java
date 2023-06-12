package com.classobjectencapsulation;
/**
* EmployeeDetails
* @author Likith
* @since 02/06/2023
* @version jdk11
*
*/
class Employee{
	String empId;
	String empName;
	String emailId;
	long phoneNumber;
	double salary;
	
	public void setEmployeeDetails() {
		empId = "ES6057";
		empName = "likith";
		emailId = "likith29@gmail.com";
	    phoneNumber = 630022718;
		salary = 60000.00; 
	}
	public void getEmployeeDetails() {
		System.out.println("EmpID: "+empId );
		System.out.println("EmpName: "+empName );
		System.out.println("EmpemailId: "+emailId);
		System.out.println("EmpPhoneNumber: "+phoneNumber );
		System.out.println("Empsalary: "+salary );
	}
	
}
/**
* EmployeeDriver class to test the method of employee details
* @author Likith
* @since 30/05/2023
* @version jdk11
*
*/
public class EmployeeDriver {

	public static void main(String[] args) {
		
		// Create object for the employee class
		Employee employee = new Employee();
		// invoke the method with employee details object
		employee.setEmployeeDetails();
		employee.getEmployeeDetails();
		

	}

}
