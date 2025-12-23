package com.string;

import java.util.Scanner;

public class find_the_longest_word {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String = ");
		String str=sc.nextLine();
		// Ashutosh Sanjay Shelke 
		int count=0;
		int length=0;
		int start=0;int templen=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
			else {
				if(count>length) {
					length=count;
					start=templen;
				}
				count=0;
				templen=i+1;
			}
		}
		if(count>length) {
		length=count;
		start=templen;
		}
		
		System.out.println(length+" Word is = "+str.substring(start,start+length));
	}
}
