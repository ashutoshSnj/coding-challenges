package com.string;

import java.util.Scanner;

public class Space_Remove {
  public static void main(String[] args) {
	  System.out.println("Enter the String = ");
		Scanner sc=new Scanner (System.in);
		String input=sc.nextLine();
	  StringBuffer output=new StringBuffer();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)!=' ') {
				output.append(input.charAt(i));
			}
		}
		System.out.println(output);
}
}
