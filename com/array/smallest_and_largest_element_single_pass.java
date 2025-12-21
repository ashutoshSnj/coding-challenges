package com.array;

public class smallest_and_largest_element_single_pass {
     public static void main(String[] args) {
		int [] arr= {12,3,4,2,3,5,6,7,3,6,7};
		int small = arr[0],large=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>large) {
				large=arr[i];
				continue;
			}
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("Small "+small+" Large ="+large);
	}
}
