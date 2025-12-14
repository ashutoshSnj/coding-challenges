package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Remove_Duplicate {
public static void main(String[] args) {
	System.out.println("Enter the STring = ");
	Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  
  
  
  // Time Complexity O(n²)
  // becose outar lopp and this contain method also itrat the totla string 
 /* ArrayList<Character>list=new ArrayList<Character>();
  
  for(int i=0;i<str.length();i++) {
	     if(str.charAt(i)==' '||(!list.contains(str.charAt(i)))) {
	    	 list.add(str.charAt(i));
	     }
  }
  
  list.stream().forEach(ref->System.out.print(ref));  */
  
  /////////////////////////////////////////////////////////////////////////////////////////////////////
  
  // Time Complexity O(n²)
  // Becose this indexOf method internally itrat all string also unique assign each time new String
  
 /* String Unique="";
  for(int i=0;i<str.length();i++) {
	  
	  if(Unique.indexOf(str.charAt(i))==-1) {
		  Unique=Unique+str.charAt(i);
	  }
  }
  System.out.println(Unique);*/
  
  
  //////////////////////////////////////////////////////////////////////////////////////////////////////////
  
  // Time Complexity is O(n)
 LinkedHashSet<Character> set=new LinkedHashSet<Character>();
  for(int i=0;i<str.length();i++) {
	  set.add(str.charAt(i));
  }
  StringBuilder newstr=new StringBuilder();
  Iterator<Character> itrater=set.iterator();
  while(itrater.hasNext()) {
	  newstr.append(itrater.next());
  }
  /* no itrater 
   for (char ch : set) {
    newstr.append(ch);
}
   */
  System.out.println(newstr);
}
}

