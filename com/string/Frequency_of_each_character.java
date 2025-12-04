package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency_of_each_character {
public static void main(String[] args) {
	
	System.out.println("Enter the String = ");
	Scanner sc=new Scanner (System.in);
	String input=sc.nextLine();
	Map<Character, Integer> map=new HashMap<Character, Integer>();
	
/*	for(int i=0;i<input.length();i++) {
		int count=1;
		for(int j=i+1;j<input.length();j++) {
			if(input.charAt(i)==input.charAt(j)) {
				count++;
				
			}
			
		}
		map.putIfAbsent(input.charAt(i), count);
	}
	map.entrySet().stream().forEach(ref->System.out.println(ref.getKey() +" "+ ref.getValue()));
	*/
	
/*	for(int i=0;i<input.length();i++) {
		map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0)+1);
	}
	map.entrySet().stream().forEach(ref->System.out.println(ref.getKey() +" "+ ref.getValue())); */
	
	int []arr=new int[256];
	for(int i=0;i<input.length();i++) {
		arr[input.charAt(i)]++;
	}
	for(int i=0;i<256;i++) {
		if(arr[i]>0) {
			System.out.println((char)i+" " +arr[i]);
		}
	}
	
}
}
