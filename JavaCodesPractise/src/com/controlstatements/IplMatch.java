package com.controlstatements;
import java.util.*;

/**
 * To read the date of the ipl match
 * @author Likith
 * @since 31/05/2023
 * @version jdk11
 *
 */
public class IplMatch {

	public static void main(String[] args) {
		Scanner read =  new Scanner(System.in);
		// reading the input from the user
		System.out.println("enter the date");
		String date = read.next();
		// provide the condition
		switch (date) {
		   case "12/05/2023":
			    System.out.println("csk vs rcb");
			    break;
		   case "13/05/2023":
				System.out.println("rcb vs hyd");
				break;
		   case "14/05/2023":
				System.out.println("mub vs kkr");	
				break;
		   case "15/05/2023":
				System.out.println("kkr vs rcb");	
				break;
		   case "16/05/2023":
				System.out.println("mub vs csk");	
				break;
		   case "17/05/2023":
				System.out.println("csk vs lsg");	
				break;
		   case "18/05/2023":
				System.out.println("rcb vs lsg");	
				break;
			default:
				System.out.println("invalid date");
			
			}	
		read.close();
		}
		

	

}
