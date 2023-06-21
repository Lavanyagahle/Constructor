package com.constructor;

import java.util.Scanner;

public class ElectricBill {
         String n;
         int units;
         double bill;
         public void accept() {
        	 Scanner sc= new Scanner(System.in);
        	 System.out.println("Enter name of customer ");
        	 n=sc.nextLine();
        	 System.out.println("Number of units consumed ");
        	 units=sc.nextInt();
        	 
         }
         public void calculate() {
        	 if(units<=1 && units>=100) {
        		 bill = (units*2);
        	 }else if(units>100 && units<=300) {
        		 bill =(units*2) +(units-100)*3;
        	 }else if(units>300) {
        		 double amount = 100*2+200*3+(units-300)*5;
        		 double surcharge = (amount * 2.5)/100.5;
        		 bill= amount+ surcharge;
        	 }else {
        		 System.out.println("Invalid output");
        	 }
         }
         public void print() {
        	 System.out.println("Name of the customer: "+n);
        	 System.out.println("Number of units consumed: "+units);
        	 System.out.println("Bill amount: "+bill);
         }
}
