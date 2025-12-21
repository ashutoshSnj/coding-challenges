package com.string;

public class string_contains_only_digits {
  public static void main(String[] args) {
	String str="12d3456";
	boolean flag=true;
/*	for(int i=0;i<str.length();i++) {
		if(!Character.isDigit(str.charAt(i))) {
			flag=false;
			System.out.println("String does not Contain only int");
			break;
		}
	}
	if(flag) {
		System.out.println("String contain only int");
	}*/
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		//     48         57
		if(ch<'0' || ch>'9') {
			flag=false;
			System.out.println("String does not Contain only int");
			break;
		}
	}
	if(flag) {
		System.out.println("String contain only int");
	}
}
}
