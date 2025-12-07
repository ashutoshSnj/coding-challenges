package com.Logic;

import java.util.Scanner;

public class Prime_No {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no = ");
      int no=sc.nextInt();
      boolean flag=true;
      if(no<=1) {
    	  System.out.println("no is not  prime");
    	  return ;
      }
      for(int i=2;i<=no/2;i++) {
    	  if(no%i==0) {
    		  flag=false;
    		  break;
    	  }
      }
      if(flag) {
    	  System.out.println("No is Prime");
      }
      else {
    	  System.out.println("No is not prime");
      }
    	  
}
}
