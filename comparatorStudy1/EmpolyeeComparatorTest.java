package com.bnt.comparatorStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmpolyeeComparatorTest {
	

	public EmpolyeeComparatorTest() {
		
	}
	public static void main(String args[]) {

		ArrayList a1 = a();
		System.out.println("Starting List :");
		displayEmp(a1);
		System.out.println("**********************");
		

		incrementEmp(a1);
		Collections.sort(a1, new EmployeeById());
		System.out.println("Employee By Id:");
		displayEmp(a1);
		System.out.println("**********************");

		Collections.sort(a1, new EmployeeByName());
		System.out.println("Employee By Name:");
		displayEmp(a1);
		System.out.println("**********************");

		Collections.sort(a1, new EmployeeBySalary());
		System.out.println("Employee By Salary:");
		displayEmp(a1);
		System.out.println("**********************");

	}

	public static ArrayList a() {
		ArrayList al = new ArrayList();
		al.add(new Employee(101, "Ritesh", 6000));
		al.add(new Employee(128, "Shivanjali", 1000));
		al.add(new Employee(301, "Akshay", 3000));
		al.add(new Employee(126, "Vishnu", 5000));
		return al;

	}
	public static void incrementEmp(ArrayList al) {
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Employee emp = (Employee) it.next();
			emp.empSalary=emp.empSalary+1000;
		}
	}

	public static void displayEmp(ArrayList al) {
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Employee emp = (Employee) it.next();
			/* emp.empSalary=emp.empSalary+1000; */
			
			System.out.println(emp);
		}
	}
}

/*
Default asending order
Starting List :
101, Ritesh, 6000
128, Shivanjali, 1000
301, Akshay, 3000
126, Vishnu, 5000
**********************
Employee By Id:
101, Ritesh, 7000
126, Vishnu, 6000
128, Shivanjali, 2000
301, Akshay, 4000
**********************
Employee By Name:
301, Akshay, 4000
101, Ritesh, 7000
128, Shivanjali, 2000
126, Vishnu, 6000
**********************
Employee By Salary:
128, Shivanjali, 2000
301, Akshay, 4000
126, Vishnu, 6000
101, Ritesh, 7000
**********************
*/

/*
 decending order
Starting List :
101, Ritesh, 6000
128, Shivanjali, 1000
301, Akshay, 3000
126, Vishnu, 5000
**********************
Employee By Id:
301, Akshay, 4000
128, Shivanjali, 2000
126, Vishnu, 6000
101, Ritesh, 7000
**********************
Employee By Name:
126, Vishnu, 6000
128, Shivanjali, 2000
101, Ritesh, 7000
301, Akshay, 4000
**********************
Employee By Salary:
101, Ritesh, 7000
126, Vishnu, 6000
301, Akshay, 4000
128, Shivanjali, 2000
**********************
*/