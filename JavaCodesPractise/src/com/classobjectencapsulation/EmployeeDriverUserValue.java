package com.classobjectencapsulation;
/**
* Employee class with identified attributes and methods
* @author Likith
* @since 02/06/2023
* @version jdk11
*
*/
import java.util.*;
class UserDetails{
	String empId;
	String empName;
	String emailId;
	long phoneNumber;
	double salary;
	
	public void setEmployeeDetails(String id, String name, String email, long phoneNo, double sal) {
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
public class  EmployeeDriverUserValue{
	
    public static void main (String[] args){
	String id, name, emailid;
	long phoneNo;
	double sal;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("empid: ");
	id = scan.next();
	
	System.out.println("\nempname: ");
	name = scan.next();
    	
	System.out.println("\nempemail: ");
	emailid = scan.next();
	
	System.out.println("\nempphonenumber: ");
	phoneNo = scan.nextLong();
	
	System.out.println("\nsalary: ");
	sal = scan.nextLong();
	
	UserDetails user = new UserDetails();
	user.setEmployeeDetails(id,name,emailid,phoneNo,sal);
	
	scan.close();
}
}
