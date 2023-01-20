package com.bnt.comparatorStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmpolyeeComparatorTest {

	public static void main(String args[])
	{
		new EmpolyeeComparatorTest();
	}

	public EmpolyeeComparatorTest()
	{
		
		ArrayList al = new ArrayList();
		al.add(new Employee(101,"Ritesh",6000));
		al.add(new Employee(128,"Shivanjali",1000));
		al.add(new Employee(301,"Akshay",3000));
		al.add(new Employee(126,"Vishnu",5000));

		System.out.println("Starting List :");
		displayEmp(al);
		System.out.println("**********************");

		Collections.sort(al,new EmployeeById());
		System.out.println("Employee By Id:");
		displayEmp(al);
		System.out.println("**********************");

		Collections.sort(al,new EmployeeByName());
		System.out.println("Employee By Name:");
		displayEmp(al);
		System.out.println("**********************");

		Collections.sort(al,new EmployeeBySalary());
		System.out.println("Employee By Salary:");
		displayEmp(al);
		System.out.println("**********************");

	}

	public void displayEmp(ArrayList al)
	{
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Employee emp = (Employee) it.next();
			System.out.println(emp);
		}
	}
}