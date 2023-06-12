package com.arraysfunction;

public class EvenElements {

	public static void main(String[] args) {
		int a[] = {12,45,43,45,79};
		System.out.println("array element");
		//for loop
		for(int i=0 ; i<a.length; i++) {
			if(a[i] % 2 ==0)
			      System.out.print(a[i] + " ");

	    }
		// for each
				System.out.println("\n");
				for(int value : a) {
					if(value % 2 == 0)
					System.out.print( value +" ");
				}
		
		
		

}
}
