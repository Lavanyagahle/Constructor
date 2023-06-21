package com.constructor;

import java.util.Scanner;

public class FruitJuice {
     int product_code;
     String flavour;
     String pack_type;
     int pack_size;
     int product_price;
     public void input() {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter product code");
    	 product_code =sc.nextInt();
    	 System.out.println("Enter flavour");
    	 flavour =sc.next();
    	 sc.nextLine();
    	 System.out.println("Enter pack type");
    	 pack_type =sc.nextLine();
    	 System.out.println("Enter pack size");
    	 pack_size = sc.nextInt();
    	 System.out.println("Enter product price");
    	 product_price =sc.nextInt();
     }
     public void discount() {
    	 product_price = product_price-10;
     }
     public void display() {
    	 System.out.println("Product code is: "+product_code);
    	 System.out.println("Flavour is: "+flavour);
    	 System.out.println("Pack type is: "+pack_type);
    	 System.out.println("Pack size is: "+pack_size);
    	 System.out.println("Product price is: "+product_price);
     }
}
