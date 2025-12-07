package com.Logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNo_1_N {
   public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
    System.out.println("Enter the start = ");
    int start=sc.nextInt();
    System.out.println("Enter End = ");
    List<Integer> list= new ArrayList<Integer>();
    int end=sc.nextInt();
    for(int i=start;i<=end;i++) {
    	boolean flag=true;
    	if(i<=1) {
    		continue;
    	}
    	for(int j=2;j<=i/2;j++) {
    		if(i%j==0) {
    			flag =false;
    			break;
    		}
    	}
    	if(flag) {
    		list.add(i);
    	}
    }
    list.stream().forEach(ref->System.out.println(ref));
}
}
