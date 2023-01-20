package com.bnt.comparatorStudy;

import java.util.Comparator;

public class EmployeeById implements Comparator{

	public int compare(Object object1, Object object2)
	{
		int value=0;

		Employee emp1 = (Employee) object1;
		Employee emp2 = (Employee) object2;

		if(emp1.empId > emp2.empId)
			value = 1;
		else if(emp1.empId < emp2.empId)
			value = -1;
		else if(emp1.empId == emp2.empId)
			value = 0;

		return value;
	}
}
