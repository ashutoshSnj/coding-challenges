package com.array;

import java.util.Arrays;

public class sort_array_using_Bubble_Sort {
   public static void main(String[] args) {
	int [] arr=new int[] {1,23,2,12,3,2,2,23,56,0};
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1-i;j++){
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
}
	Arrays.stream(arr).forEach(ref->System.out.print(ref+" "));
}
}
