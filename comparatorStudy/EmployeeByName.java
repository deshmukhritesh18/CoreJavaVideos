package com.bnt.comparatorStudy;

import java.util.Comparator;

public class EmployeeByName implements Comparator {
	
	public int compare(Object object1, Object object2)
	{
		Employee emp1 = (Employee) object1;
		Employee emp2 = (Employee) object2;

		return emp1.empName.compareTo(emp2.empName);
	}
}

