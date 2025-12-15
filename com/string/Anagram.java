package com.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Anagram {
  public static void main(String[] args) {
	String str="toshsuha";
	String btr="ahusshot";
	if(str.length()!=btr.length()) {
		System.out.println("String is not Anagram");
		return;
	}
	/*
	HashMap<Character, Integer> strmap=new HashMap<Character, Integer>();
	HashMap<Character, Integer> btrmap=new HashMap<Character, Integer>();
	for(int i=0;i<str.length();i++) {
		strmap.put(str.charAt(i), strmap.getOrDefault(str.charAt(i), 0)+1 );
		btrmap.put(btr.charAt(i), btrmap.getOrDefault(btr.charAt(i), 0)+1);
	}

	Iterator<Entry<Character, Integer>>stri=strmap.entrySet().iterator();
//	Iterator<Entry<Character, Integer>>btri=btrmap.entrySet().iterator();
	boolean flag=true;
	while(stri.hasNext()) {
	Entry<Character, Integer> ent  = stri.next();
	Integer no=btrmap.get(ent.getKey());
	if(no==null || no!=ent.getValue()) {
		flag=false;
		break;
	}
	}
	if(flag) {
		System.out.println("String is Anagram");
	}
	else {
		System.out.println("String is not Anagram");
	}*/
	 HashMap<Character, Integer> map = new HashMap<>();

     
     for (char ch : str.toCharArray()) {
         map.put(ch, map.getOrDefault(ch, 0) + 1);
     }

     boolean simple=true;
    for(int i=0;i<str.length();i++) {
    	Integer in=map.get(btr.charAt(i));
    	if(in==null || in==0) {
    		 System.out.println("Not Anagram");
    		 simple=false;
    		 break;
    	}
    	map.put(btr.charAt(i), in-1);
    }
    
 if(simple) {
     System.out.println("Anagram");
 }
     int []arr=new int[256];
     for(int i=0;i<str.length();i++){
    	 arr[str.charAt(i)]++;
    	 arr[btr.charAt(i)]--;
     }
     boolean flag =true;
     for(int i=0;i<arr.length;i++) {
    	 if(arr[i]!=0) {
    		 flag=false;
    		 System.out.println("Not Anagram");
    		 break;
    	 }
     }
     if(flag) {
    	 System.out.println("Anagram");
     }
}
  
}
