package com.constructor;

public class StudentConstructor {
 int studentid;
 String studentname;
 public StudentConstructor() {
	 studentid = 1;
	 studentname ="Aniket";
	 System.out.println("Student id: "+studentid);
	 System.out.println("Student name: "+studentname);
 }
 public StudentConstructor(int i, String name) {
	 studentid= i;
	 studentname = name;
 }	 
 public void display() {
	 System.out.println("Student id: "+studentid);
	 System.out.println("Student name: "+studentname);
 }
}
