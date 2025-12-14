package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class count_the_occurrences {
	
public static void main(String[] args) {
	System.out.println("Enter the String = ");
	Scanner sc=new Scanner (System.in);
	String input=sc.nextLine();
	Map<Character, Integer> map=new HashMap<Character, Integer>();
	for(int i=0;i<input.length();i++) {
		map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0)+1);
	}
	//map.entrySet().stream().forEach(ref->System.out.println(ref.getKey()+" "+ref.getValue()));
	
  String str="Ashutosh";
  int[]arr=new int[256];
  for(int i=0;i<str.length();i++) {
	  arr[str.charAt(i)]= arr[str.charAt(i)]+1;
  }
  for(int i=0;i<arr.length;i++) {
	  if(arr[i]>0) {
     System.out.println(i+"   "+(char)i+"   "+	 arr[i]);
	  } 
  }
	
}
}
