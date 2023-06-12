package com.classobjectencapsulation;

class Employeeencap{
	private String empId;
	private String empName;
	private String emailId;
	private long phoneNumber;
	private double salary;
	
	public Employeeencap(String empId, String empName, String emailId, long phoneNumber, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
	
	public Employeeencap(String empId, String empName, String emailId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.emailId = emailId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpId() {
		return empId;	
	}
	public void setName(String empName) {
		this.empName = empName;
	}
	public String getEmpName() {
		return empName;	
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class EmployeeencapDriver {

	public static void main(String[] args) {
		Employeeencap ec2 = new Employeeencap("ec123","ambani","alikiht@123.com",12347455,1233);
		System.out.println(ec2.getEmpId());
		System.out.println(ec2.getEmpName());
		System.out.println(ec2.getEmailId());
		System.out.println(ec2.getPhoneNumber());

	}

}
