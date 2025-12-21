package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sort_an_array_using_Bubble_Sort {
  public static void main(String[] args) {
	int[] arr= {10,2,3,4,6,8,0,8,75,6,78,1};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[i]) {
			  int 	temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}  
		}
	}
	Arrays.stream(arr).forEach(ref->System.out.print(ref+" "));
}
}
