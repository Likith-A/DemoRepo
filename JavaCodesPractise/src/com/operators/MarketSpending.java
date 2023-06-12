package com.operators;
import java.util.Scanner;

/**
 * To calculate the amount spend to market
 * @author A Likith
 * @since 30/05/2023
 * @version jdk11
 *
 */
public class MarketSpending {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter pocket money amount:");
		int pocketMoney = read.nextInt();
		
		System.out.println("enter apple amount:");
		int appleCost = read.nextInt();
		
		System.out.println("enter banana amount:");
		int bananaCost = read.nextInt();
		
		System.out.println("total money: "+(appleCost+bananaCost));
		System.out.println("remaining money when reach to home: "+((pocketMoney)-(appleCost+bananaCost))*3);
		System.out.println("money deposited to magic machine: "+(pocketMoney-(appleCost+bananaCost)));
		
		read.close();
		

	}

}
