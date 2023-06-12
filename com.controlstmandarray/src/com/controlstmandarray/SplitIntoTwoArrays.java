package com.controlstmandarray;
/**
 * To find pair of elements in the array having sum of 10
 * @author Likith
 * @version jdk11
 * @since 12/06/2023
 */
import java.util.*;
public class SplitIntoTwoArrays {
	public static void main(String[] args) {
		System.out.println("enter the number of element");
        Scanner read = new Scanner(System.in);
        int N=read.nextInt();
        System.out.println("enter the array elements");
        int []arr1=new int[N];
        for(int i=0;i<N;i++) {
            arr1[i]=read.nextInt();
        }
        int avg=0;
        int sum=0;
        for(int i=0;i<arr1.length;i++) {
            sum=sum+arr1[i];
        }
        avg=sum/arr1.length;
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        for(int i=0;i<arr1.length;i++) {
            if(arr1[i]<avg)al1.add(arr1[i]);
            else al2.add(arr1[i]);    
        }
        System.out.println(al1);
        System.out.println(al2);
        read.close();
    }
}

 
