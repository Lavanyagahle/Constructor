package com.constructor;

public class EmployeeMain {
public static void main(String[] args) {
	EmployeeConstructor x = new EmployeeConstructor();
	EmployeeConstructor y = new EmployeeConstructor(102, "Srushti");
	EmployeeConstructor z= new EmployeeConstructor(103, "Khushi");
	y.display();
	z.display();
}
}
