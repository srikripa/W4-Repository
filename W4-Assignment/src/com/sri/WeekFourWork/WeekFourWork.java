package com.sri.WeekFourWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class WeekFourWork {

	public static void main(String[] args) {
		
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println("***                                                                             *** ***");
		System.out.println("*** Week 4 Coding Assignment - Collections & StringBuilders                     *** ***");
		System.out.println("*** Student: SRI SRINIVASAN                                                     *** ***");
		System.out.println("***                                                                             *** ***");
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println();		
		
		//	***********************************************************************************
		// Item 1 & 4a of Week 4 Assignment:
		//	1. 	Create an instance of an ArrayList of String called employeeNames
		// 		List<String> employeeNames = new ArrayList<String>();
		// 	4a.	Add at least five entries to the employeeNames and ids 
		//		(make sure both collections have the same number of entries).
		//	***********************************************************************************
		
		List<String> employeeNames = new ArrayList<String>();		//Create ArrayList os String
		
		System.out.println("Item 1, 2 & 3 of Week 4 Assignment");
    	System.out.println("ArrayList of String created by - List<String> employeeNames = new ArrayList<String>()");
    	System.out.println("HashSetof Integer created by - HashSet<Integer> ids = new HashSet<Integer>();");
    	System.out.println("HashMap of Integer and String created by - HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();");
		System.out.println("*******************************************************************************************************************");
		System.out.println();
		
		employeeNames.add("Adam");									//Adding entries to employeeNames
		employeeNames.add("Bob");
		employeeNames.add("Cathy");
		employeeNames.add("David");
		employeeNames.add("Eddie");
		
		System.out.println("Item 4a of Week 4 Assignment - add 5 entries to employeeNames");
		System.out.println(employeeNames);
		System.out.println("*************************************************************************************");
		System.out.println();
		
		//	***********************************************************************************
		//	Item 2 & 4b of Week 4 Assignment
		//	2.	Create an instance of a HashSet of Integer called ids
		//		HashSet<Integer> ids = new HashSet<Integer>();
		//	4b.	Add at least five entries to the employeeNames and ids 
		//		(make sure both collections have the same number of entries).
		//	***********************************************************************************
		
		HashSet<Integer> ids = new HashSet<Integer>();				//Create HashSet of integers
		
		ids.add(3);													//Adding entries to ids
		ids.add(6);
		ids.add(9);
		ids.add(12);
		ids.add(15);
		
		System.out.println("Item 4b of Week 4 Assignment - add 5 entries to ids");
		System.out.println(ids);
		System.out.println("*************************************************************************************");
		System.out.println();

		//	***********************************************************************************
		//	Item 3 of Week 4 Assignment
		//	3.	Create an instance of a HashMap of Integer, String called employeeMap
		//		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
		//	***********************************************************************************
		
		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();	//Create HashMap
		
		//	***********************************************************************************
		//	Item 5 of Week 4 Assignment
		//	5.	use enhanced for loop to populate employeeMap from ids and employeeNames
		//	***********************************************************************************

		int i = 0;
		for (int x : ids) {		//Using enhanced for loop to populate employeeMap from employeeNames and ids
			employeeMap.put(x, employeeNames.get(i));
			i++;
		}
		
		System.out.println("Item 5 of Week 4 Assignment - populate employeeMap, displaying content");
		System.out.println(employeeMap.toString());
		System.out.println("*************************************************************************************");
		System.out.println();

		
		//	***********************************************************************************
		// 	Item 6 of Week 4 Assignment
		// 6.	Create employeeMap.keySet(),  use enhanced for loop to print both key and value.
		//	***********************************************************************************
		
		System.out.println("Item 6 of Week 4 Assignment - Iterate over HashMap Keys and Values");
		
		for(Integer key : employeeMap.keySet())	{
		    System.out.println( key + " = " + ": " + employeeMap.get(key) );
		}
		
		System.out.println("*************************************************************************************");
		System.out.println();
	
		System.out.println("Item 7 of Week 4 Assignment");
		System.out.println("StringBuilder idsBuilder created by - StringBuilder idsBuilder = new StringBuilder();");
		System.out.println("*************************************************************************************");
		System.out.println();
		
		// Item 8 & 9 of Week 4 Assignment
		// 8.	Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
		// 9.	Print the result of idsBuilder.toString() to the console.
		
		StringBuilder idsBuilder = new StringBuilder();
		int y = 0;
		for( Integer j : ids ){
			if (y < (ids.size() - 1))	{
            	idsBuilder.append(j + "-");
            	y++;
            }	else {
            	idsBuilder.append(j);
            }
        }

		System.out.println("Item 8 & 9 of Week 4 Assignment here");
        System.out.println(idsBuilder.toString());
		System.out.println("*****************************************************************************************");
		System.out.println();

		// Item 10, 11 & 12 of Week 4 Assignment
		// 10.	Create another StringBuilder called namesBuilder.
		// 11.	Iterate over employeeNames ArrayList & append each name, followed by space “ “ to namesBuilder.
		// 9.	Print the result of idsBuilder.toString() to the console.
	
    	StringBuilder namesBuilder = new StringBuilder();

		System.out.println("Item 10 of Week 4 Assignment");
    	System.out.println("StringBuilder namesBuilder created by - StringBuilder namesBuilder = new StringBuilder();");
		System.out.println("*****************************************************************************************");
		System.out.println();
    	
    	Iterator<String> iterator = employeeNames.iterator();
    	 
    	//iterate using hasNext and next methods
    	
    	int k = 0;
    	
    	while( iterator.hasNext() ){
   		if (k < (employeeNames.size() - 1))	{
        		namesBuilder.append(iterator.next() + " ");
        		k = k + 1;
    	    }	else	namesBuilder.append(iterator.next());	//else used to ensur the last item does not get a - added
    	} 
    	
		System.out.println("Item 11 & 12 of Week 4 Assignment");
		System.out.println( namesBuilder.toString());
		System.out.println("*****************************************************************************************");
		System.out.println();


	}

}
