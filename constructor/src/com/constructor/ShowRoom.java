/*Design a class name ShowRoom with following description
 * instance variable/Data Members:
 * String name- To store the name of the customer
 * long mobno- To store the mobile number of customer
 * double cost- To store the cost of the items purchased
 * double dis- To store discount
 * double amount- To store the amount to be paid after discount
 * member methods
 * void input()-customer name, mobile number, cost
 * void calculate discount on the cost purchased items
 * based on following criteria
 */
package com.constructor;

import java.util.Scanner;

public class ShowRoom {
           String name;
           long mobno;
           double cost;
           double dis;
           double amount;
           public void input() {
        	   Scanner sc= new Scanner(System.in);
        	   System.out.println("Enter name of customer ");
        	   name= sc.nextLine();
        	   System.out.println("Enter mobile number");
        	   mobno= sc.nextLong();
        	   System.out.println("Enter cost of item purchased");
        	   cost=sc.nextDouble();
           }
           public void calculate() {
        	   if(cost<0) {
        		   System.out.println("Invalid ");
        		   System.exit(0);
        	   }
        	   if(cost <=10000) {
        		   dis=0.05*cost;
        	   }else if(cost>=10000 && cost<=20000) {
        		   dis=0.10*cost;
        	   }else if(cost>=20000 && cost<=35000) {
        		   dis=0.15*cost;
        	   }else {
        		   dis= 0.20*cost;
        		
        	   }
        	   amount = cost - dis;
           }
           public void display() {
        	   System.out.println("Name: "+name);
        	   System.out.println("Mobile Number "+mobno);
        	   System.out.println("Cost "+cost);
        	   System.out.println("Discount "+dis);
        	   System.out.println("Total Amount "+amount);
           }
}
