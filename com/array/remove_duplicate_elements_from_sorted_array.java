package com.array;

import java.util.Arrays;

public class remove_duplicate_elements_from_sorted_array {
   public static void main(String[] args) {
	int arr[]= {1,1,2,2,3,3,4,4,5,5,6};
	int size=arr.length-1;
	for(int i=0;i<size;i++) {
		if(arr[i]==arr[i+1]) {
			for(int j=i+1;j<size;j++) {
				arr[j]=arr[j+1];
			}
			size--;
			i--;
			
	}
	
}
	for(int i=0;i<size;i++) {
		System.out.println(arr[i]);
	}
}
   
}
/*
int j = 0;
for (int i = 1; i < arr.length; i++) {
    if (arr[i] != arr[j]) {
        j++;
        arr[j] = arr[i];
    }
}


 * */
