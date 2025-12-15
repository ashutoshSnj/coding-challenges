package com.Logic;

import java.util.Scanner;

public class greatest_common_divisor {
public static void main(String[] args) {
	 System.out.println(" Enter both no = ");
	 Scanner sc=new Scanner(System.in);
	 int no1=sc.nextInt();
	 int no2=sc.nextInt();
	 int small=(no1>no2)?no2:no1;
	 int result=1;
	 for(int i=2;i<=small;i++) {
		 if(no1%i==0 && no2%i==0) {
			 result=i;
		 }
	 }
	 System.out.println("GCD is = "+result);
	 /*
	  *   System.out.print("Enter both numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD is = " + a);
	  */
}
}
