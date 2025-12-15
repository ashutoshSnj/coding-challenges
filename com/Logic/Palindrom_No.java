package com.Logic;

import java.util.Scanner;

public class Palindrom_No {
  public static void main(String[] args) {
	System.out.println("Enter the no = ");
	Scanner sc=new Scanner (System.in);
	int no=sc.nextInt();
  int 	temp=no;
	int result=0;
	while(no>0) {
		int a=no%10;
		 result=result*10+a;
		 no=no/10;
	}
	if(result==temp) {
		System.out.println("no is palindrom");
	}
	else {
		System.out.println("No is not palindrom");
	}
}
}
