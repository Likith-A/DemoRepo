package StreamApi;

import java.util.*;

class Employee1{
	private String name;
	private String account;
	private Integer Salary;
	// constructor
	public Employee1(String name, String account, Integer salary) {
		super();
		this.name = name;
		this.account = account;
		this.Salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Integer getSalary() {
		return Salary;
	}
	@Override
	//declared the string
	public String toString() {
		return "Employee1 [name=" + name + ", account=" + account + ", Salary=" + Salary + "]";
	}
}

public class Employee{

	public static void main(String[] args) {
		List<Employee1> empList = new ArrayList<>();
		empList.add(new Employee1("ravi","account",2590));
		empList.add(new Employee1("yuvi","Admin",2800));
		empList.add(new Employee1("lavi","account",20000));
		empList.add(new Employee1("avi","Admin",18000));
		
		empList.stream().filter(emp->emp.getAccount().matches("Admin")).findFirst().ifPresent(System.out::println);
		System.out.println("-------------------------------");
		
		empList.stream().filter(emp->emp.getAccount().matches("Admin")).findAny().ifPresent(System.out::println);
	
		

	}

}
