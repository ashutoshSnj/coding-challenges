package com.string;

import java.util.Scanner;

public class vowels {
public static void main(String[] args) {
	//a, e, i, o,  u
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the String = ");
	String str=sc.nextLine();
	int count=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			count++;
		}
	}
	System.out.println(count);
 }
}
