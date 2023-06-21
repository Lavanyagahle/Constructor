package com.constructor;

public class Products {

 //instance var
	int productid;
	String productname;
	
	//constructor with no-argument
	public Products(){ //name of the constructor should be same name as class
		                    //no return type
		                     //On object creation constructor is called
		                     //used to initialize the instantnce variable of a class
	
		
		productid=1;
		productname ="priya";
		System.out.println("product id="+productid);
		System.out.println("Product name="+productname);
		
		
	}
	
	public Products(int i, String n) { //constructor with argument
		productid=i;
		productname=n;
		System.out.println("product id="+productid);
		System.out.println("Product name="+productname);
	}
			
	//void methodProudct() {
		
		
	//}
}
