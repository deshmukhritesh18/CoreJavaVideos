package com.bnt.map;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTest {
    public static void main(String[] args) {

        Map<Integer, Employee> empMap = new HashMap<>();
        empMap.put(1, new Employee(101, "Ritesh", "Pune"));
        empMap.put(2, new Employee(102, "Akshay", "Satara"));
        empMap.put(3, new Employee(103, "Shivaji", "Sangali"));
        empMap.put(4, new Employee(104, "Vishanu", "Nagpur"));
        empMap.put(5, new Employee(105, "Om", "Mumbai"));

        System.out.println(empMap);
    }
}