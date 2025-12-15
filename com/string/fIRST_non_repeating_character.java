package com.string;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class fIRST_non_repeating_character {
public static void main(String[] args) {
	String str="Ashutosh";
	
	
	// Time COmplexity O(n²)
	
	for(int i=0;i<str.length();i++) {
		boolean flag=true;
		for(int j=0;j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j) && i!=j) {
				flag=false;
				break;
			}
			
		}
		if(flag) {
			System.out.println(str.charAt(i));
			break;
		}
	}
	
	
}
}
