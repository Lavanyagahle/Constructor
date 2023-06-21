package com.constructor;

public class EmployeeConstructor {
    int empId;
    String empName;
    public EmployeeConstructor() {
    	empId =101;
    	empName ="Priyanka";
    	System.out.println("Employee id: "+empId);
    	System.out.println("Employee name: "+empName);
    }
    public EmployeeConstructor(int n, String name) {
    	empId = n;
    	empName = name;
    }
    public void display() {
    	System.out.println("Employee id: "+empId);
    	System.out.println("Employee name: "+empName);
    }
}
