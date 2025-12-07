package com.Logic;

import java.util.Scanner;

public class Fibonacci_series {
     public static void main(String[] args) {
    	System.out.println("Enter the N th no = ");
    	Scanner sc=new Scanner(System.in);
    	int no =sc.nextInt();
	/*	int [] series=new int[no];
		series [0]=0;
		series [1]=1;
		
		for(int i=2;i<no;i++) {
			series[i]=series[i-1]+series[i-2];
		}
	int	count=0;
		while(count<no) {
			System.out.print(" " +series[count]);
			count++;
		}*/
    	int first=0;
    	int next=1;
    	for(int i=0;i<no;i++) {
    		System.out.println(first +" ");
    	int temp=first+next;
    	first=next;
    	next=temp;
    	}
    		
	}
}
