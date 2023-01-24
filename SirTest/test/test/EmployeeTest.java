package com.bnt.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeTest t=new EmployeeTest();

		List al = t.name();
		// System.out.println(al);
		for (Object e : al) {
			// System.out.println(al);
			Employee emp = (Employee) e;
			String empName = emp.getName();
			String s = "";
			Map<String, Integer> m = new HashMap<String, Integer>();
			int count = 0;
			for (int i = 0; i < empName.length(); i++) {
				s = s + empName.charAt(i);
				System.out.println(s);

				if (empName.charAt(i) == 'a' || empName.charAt(i) == 'e' || empName.charAt(i) == 'i'
						|| empName.charAt(i) == 'o' || empName.charAt(i) == 'u' || empName.charAt(i) == 'A'
						|| empName.charAt(i) == 'E' || empName.charAt(i) == 'I' || empName.charAt(i) == 'O'
						|| empName.charAt(i) == 'U') {
					count++;

				}
				m.put(empName, count);

			}
			System.out.println(m);
			System.out.println("****************");

		}

	}

	public List name() {

		List l = new ArrayList();
		l.add(new Employee("Ritesh", 5000, "Mech"));
		l.add(new Employee("Arpit", 2000, "Cs"));
		l.add(new Employee("Shivaji", 5000, "Extc"));
		l.add(new Employee("Vivek", 5000, "Mech"));
		l.add(new Employee("Deepak", 2000, "Cs"));
		l.add(new Employee("Om", 5000, "Extc"));
		return l;

	}
}