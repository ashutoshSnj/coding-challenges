package com.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_duplicate_elements {
  public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,2,2,3,54};
/*	int len=arr.length-1;
	for(int i=0;i<=len;i++) {
		for (int j=i+1;j<=len;j++) {
			if(arr[i]==arr[j]) {
			int temp=arr[j]	;
			arr[j]=arr[len];
			arr[len]=temp;
			len--;
			j--;
			}
		}
		
	}
	for (int i=0;i<=len;i++) {
		System.out.println(arr[i]);
	}
	*/
	
	List<Integer>list=new ArrayList<Integer>();
    Arrays.stream(arr).forEach(ref->list.add(ref));
	
    for(int i=0;i<list.size();i++) {
    	for(int j=i+1;j<list.size();j++) {
    		if(list.get(i).equals(list.get(j))) {
    			list.remove(j);
    			j--;
    			
    		}
    	}
    }
	list.stream().forEach(ref->System.out.println(ref));
}
}
