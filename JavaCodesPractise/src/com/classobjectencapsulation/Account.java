package com.classobjectencapsulation;
/**
* Amount credited and show balance
* @author Likith
* @since 02/06/2023
* @version jdk11
*
*/

class Account1 {
	private String id;
	private String name;
	private int balance;
	
	public Account1(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Account1(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account1 [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}	
	public int credit(int amount) {
		balance=balance+amount;
		return balance;
	}
	public int debit(int amount) {
		if(amount <= balance)
			balance= amount-balance;
		else
			System.out.println("amount is exceeded balance");
		return balance;
	}
}

public class Account {

	public static void main(String[] args) {
		
	
		Account1 acc = new Account1("124", "ravi", 50000);
		System.out.println(acc.getBalance());
		System.out.println("credit "+acc.credit(25000));
		System.out.println(acc);

	}

}
