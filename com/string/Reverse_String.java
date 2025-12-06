package com.string;

public class Reverse_String {
    public static void main(String[] args) {
		String str="Ashutosh";
		StringBuilder build=new StringBuilder(str);
		int len=build.length()-1;
		
	for(int i=0;i<build.length()/2;i++) {
		char temp=build.charAt(i);
			build.setCharAt(i, build.charAt(len));
			build.setCharAt(len, temp);
			len--;
		}
	System.out.println(build);
		
	}
}
