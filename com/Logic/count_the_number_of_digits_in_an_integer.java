package com.Logic;

import java.util.Scanner;

public class count_the_number_of_digits_in_an_integer {
      
	public static void main(String[] args) {
	  System.out.println("Enter the no = ");
	  Scanner sc=new Scanner(System.in);
	  int no=sc.nextInt();
	  int count=0;
	  if(no==0){
		  count=1;
	  }
	  // if no is negative 
	  no=Math.abs(no);
	  // this method convert negative not to absolut + no
	  while(no>0) {
		  count++;
		  no=no/10;
	  }
	  System.out.println(count);
	}
}
