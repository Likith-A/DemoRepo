package com.classobjectencapsulation;
/**
* Employee class with identified attributes and methods// constructor overloading
* @author Likith
* @since 02/06/2023
* @version jdk11
*
*/
class Employeec{
	String empId;
	String empName;
	String emailId;
	long phoneNumber;
	double salary;
	
	//default Constructor
	public Employeec() {
		empId = "ES6057";
		empName = "likith";
		emailId = "likith29@gmail.com";
	    phoneNumber = 630022718;
		salary = 60000.00;
	}
	
	//parameterized Constructor- three arg
	public Employeec(String id, String name, String emailid) {
		empId =id;
		empName = name;
		emailId = emailid;
	}
	
	//parameterized Constructor- all arg
		public Employeec(String id, String name, String email, long phoneNo, double sal) {
			empId = id;
			empName = name;
			emailId = email;
		    phoneNumber = phoneNo;
			salary = sal; 
			
		}
		
		public void getEmployeeDetails() {
			System.out.println("EmpID: "+empId );
			System.out.println("EmpName: "+empName );
			System.out.println("EmpemailId: "+emailId);
			System.out.println("EmpPhoneNumber: "+phoneNumber );
			System.out.println("Empsalary: "+salary );
		}
		
	
}
public class EmployeeConstructor {

	public static void main(String[] args) {
		
		//Object for default constructor
		Employeec ec = new Employeec();
		ec.getEmployeeDetails();
		
		
		// object for parameterized
		Employeec ec1 = new Employeec("ec1233","ambani","alikjhh@133.com");
		ec1.getEmployeeDetails();
		
		//object for parameterized- all arg
		Employeec ec2 = new Employeec("ec123","ambani","alikiht@123.com",12347455,1233);
		ec2.getEmployeeDetails();

	}

}
