package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Longest_String {
    /* public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the String = ");
	   String str=sc.nextLine();
	   StringBuilder largest=new StringBuilder();
	   for(int i=0;i<str.length();i++) {
		   boolean []arr=new boolean[256];
		   //String current="";
		   StringBuilder current=new StringBuilder()
;		   for(int j=i;j<str.length();j++) {
			   if(arr[str.charAt(j)]) {
				   break;
			   }
			   else {
				   arr[str.charAt(j)]=true;
				  // current+=current;
				   current.append(str.charAt(j));
			   }
			   if(current.length()>largest.length()) {
				 largest = new StringBuilder(current);

				   
			   }
			   
		   }

	   }
	   System.out.println(largest);
	   }
	   */
    	 
    	 
/*
public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.nextLine();

        HashSet<Character> set = new HashSet<>();
        int start = 0;
        String longest = "";

        for (int end=0;end<str.length();end++) {

            char ch=str.charAt(end);

            while (set.contains(ch)) {
                set.remove(str.charAt(start));
                start++;
            }

            set.add(ch);

            String current = str.substring(start, end + 1);
            if (current.length() > longest.length()) {
                longest = current;
            }
            

        System.out.println("Longest substring without repeating characters:");
        System.out.println(longest);
    }
}*/
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter String:");
	        String str = sc.nextLine();
	        List<Character> list=new ArrayList<Character>();
	      
	        String longest="";
	        int start=0;
	        for(int i=0;i<str.length();i++) {
	        	char ch=str.charAt(i);
	        	while(list.contains(str.charAt(i))){
	        	//	System.out.println(str.charAt(start));
	        		list.remove((Character) str.charAt(start));
	        		start++;
	        	}
	           list.add(ch);
	          
	           String dummy1=str.substring(start,i+1);
	           if(dummy1.length()>longest.length()) {
	        	   longest=dummy1;
	           }
	        }
	      System.out.println(longest);  
	}
}
