package com.Collection;

import java.util.*;
import java.util.Set;


public class HaspMapDemo {

	public static void main(String[] args) {
		HashMap<String,Double> tm = new HashMap<String,Double>();
		System.out.println("size of the hashmap: "+tm.size());
		tm.put("ravi",230.8);
		tm.put("yuvi",290.8);
		tm.put("abhi",280.8);
		tm.put("raj",270.8);
		tm.put("hari",250.8);
		tm.put("lal",250.8);
		System.out.println("elements in the hashset: "+tm);
		System.out.println("size of the hashset: "+tm.size());
		
		Set<Map.Entry<String,Double>> set = tm.entrySet();	
		for (Map.Entry<String,Double> me:set ) {
//			System.out.println(me.getKey()+ ";");
//			System.out.println(me.getValue());	
					
//			System.out.println(me.getKey());
			
			System.out.println(me.getValue());
			
			
			
		}

				
	}

}
