package com.string;

import java.util.Scanner;

public class Palindrome_String {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the String = ");
	String str=sc.nextLine();
	int j=str.length()-1;
	boolean flag=true;
	for(int i=0;i<str.length()/2;i++) {
		if(str.charAt(i)!=str.charAt(j)) {
			flag=false;
		break;
		}
		j--;
	}
	if(flag) {
		System.out.println("String is Palindrom");
	}
	else {
		System.out.println("String is not palindrom");
	}
}
}
