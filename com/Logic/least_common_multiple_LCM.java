package com.Logic;

import java.util.ArrayList;
import java.util.Scanner;

public class least_common_multiple_LCM {
   public static void main(String[] args) {
	System.out.println("Enter the Both no = ");
	Scanner sc=new Scanner(System.in);
	int no1=sc.nextInt();
	int no2=sc.nextInt();
	ArrayList<Integer> list1=new ArrayList<Integer>();
	for(int i=2;i<=10;i++){
		list1.add(no1*i);
	}
	ArrayList<Integer> list2=new ArrayList<Integer>();
	for(int i=2;i<=10;i++){
		list2.add(no2*i);
	}
	for(int i=0;i<list1.size();i++) {
		for(int j=0;j<list2.size();j++) {
			if(list1.get(i)==list2.get(j)) {
				System.out.println(list1.get(i));
				break;
			}
		}
	}
	
}
}
