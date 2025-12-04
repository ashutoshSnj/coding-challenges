package com.string;

import java.util.Scanner;

public class count_words {
	
 public static void main(String[] args) {
	 System.out.println("Enter the String = ");
		Scanner sc=new Scanner (System.in);
		String input=sc.nextLine();
		int count=1;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' ' && input.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count);
}
}
