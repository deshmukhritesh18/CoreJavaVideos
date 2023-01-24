package com.bnt.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeTest {
    public static void main(String[] args) {
  

        Map<Integer, Employee> empMap = new LinkedHashMap<>();

        Map<Integer, Employee> empMap1 = new HashMap<>();
        
        empMap.put(1001, new Employee(101, "Ritesh", "Pune"));
        empMap.put(1002, new Employee(102, "Akshay", "Satara"));
        empMap.put(1003, new Employee(103, "Shivaji", "Sangali"));
        empMap.put(500, new Employee(104, "Vishanu", "Nagpur"));
        empMap.put(5, new Employee(105, "Om", "Mumbai"));

        System.out.println(empMap);
        empMap1.putAll(empMap);
        System.out.println(empMap1);
        Set s=empMap.entrySet();
    	Iterator itr=s.iterator();
		while(itr.hasNext()) {
			
			Map.Entry e1=(Map.Entry) itr.next();//Map.Entry==map is outer class and Entery is Inner class
			System.out.println(e1.getKey()+" => "+e1.getValue());
			if(e1.getKey()==(Integer)2) {
				empMap1.remove(2);
				
			}
		
		}
			System.out.println(empMap1);
			
		    for (Map.Entry<Integer,Employee> entry : empMap.entrySet()) {
	            System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());
	            if(entry.getKey()==(Integer)2) {
					empMap1.remove(3);
					
				}
		    
	    }
		    System.out.println(empMap1);
    }
    }
