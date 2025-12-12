package com.array;

import java.util.HashMap;
import java.util.Map;

public class frequency_of_each_element {
	 public static void main(String[] args) {
		  int [] arr=new int  [] {1,3,4,6,7,8,9,0,34};
		  Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		  for(int i=0;i<arr.length;i++) {
			  map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		  }
		  map.entrySet().stream().forEach(ref->System.out.println(ref.getKey()+" "+ref.getValue()));
		}
}
