package com.constructor;

import java.util.Scanner;

public class MovieMagic {
  int year;
  String title;
  float rating;
   public MovieMagic(){
	  year =0;
	  rating =0;
	  title ="";
	  
  }
   public void accept() {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter the title");
	   title =sc.nextLine();
	   System.out.println("Enter the year");
	   year=sc.nextInt();
	   System.out.println("Enter rating");
	   rating=sc.nextFloat();
   }
   public void display() {
	   System.out.println("The Title of the movie: "+title);
	   System.out.println("Year of the movie: "+year);
	   if(rating>=0.0 && rating<=2.0) {
		   System.out.println("Flop");
	   }else if(rating>=2.1 && rating<=3.4) {
		   System.out.println("Semi-hit");
	   }else if(rating>=3.5 && rating<=4.5) {
		   System.out.println("Hit");
	   }else if(rating>=4.6 && rating<=5.0) {
		   System.out.println("Super Hit");
	   }else {
		   System.out.println("Invalid");
	   }
   }
}
