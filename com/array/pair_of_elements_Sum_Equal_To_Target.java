package com.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.function.IntFunction;

public class pair_of_elements_Sum_Equal_To_Target {
  public static void main(String[] args) {
	  int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
	  int target=5;
	  // Time Complexity O(n2)
	for(int i=0;i<arr.length;i++) {
		 for(int j=i+1;j<arr.length;j++) {
			 if(arr[i]+arr[j]==target) {
				 System.out.println(arr[i]+"  "+arr[j]);
			 }
		 }
	}
	
	//O(n)
	
	HashSet<Integer>set=new HashSet<Integer>();
	int requird=0;
	for(int no:arr) {
	    requird=target-no;
	
	if(set.contains(requird)) {
		System.out.println(requird+" "+no);
	}
	set.add(no);
	
	}
}
}
