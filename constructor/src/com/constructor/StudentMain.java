package com.constructor;

public class StudentMain {
public static void main(String[] args) {
	StudentConstructor a= new StudentConstructor();
	StudentConstructor b= new StudentConstructor(2,"Prem");
	StudentConstructor c= new StudentConstructor(3,"Anand");
	b.display();
	c.display();
	
}
}
