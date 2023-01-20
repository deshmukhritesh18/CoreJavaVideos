package com.bnt.comparatorStudy;

public class Employee {
	 public int empId;
	 public String empName;
	 public int empSalary;
	 
	 public Employee() {
		 
	 }
	 public Employee(int empId, String empName,int empSalary )
	 {
	 this.empId = empId;
	 this.empName = empName;
	 this.empSalary = empSalary;
	 }
	 
	 public String toString()
	 {
	 return this.empId +", "+this.empName+", "+this.empSalary;
	 }
	}


    
  



