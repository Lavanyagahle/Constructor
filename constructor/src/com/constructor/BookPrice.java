package com.constructor;

import java.util.Scanner;

public class BookPrice {
      String Bname;
      double price;
      double discount;
      double amount;
      public void input() {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter the name of book ");
    	  Bname = sc.nextLine();
    	  System.out.println("Enter the price of book");
    	  price =sc.nextDouble();
    	  
      }
      public void calculate() {
    	  
    		  
    	  if(price<=1 && price<=1000) {
    		  discount= 0.02*price;
    	  }else if(price>=1000 && price<=3000) {
    		  discount =0.10*price;
    	  }else if(price>3000) {
    		  discount =0.15*price;
    	  }else {
    		  System.out.println("Invalid");
    	  }
    	  amount = price - discount;
      }
      public void display() {
    	  System.out.println("Name of book: "+Bname);
    	  System.out.println("Price of book after discount: "+amount);
      }
}
