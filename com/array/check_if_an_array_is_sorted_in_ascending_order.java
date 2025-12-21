package com.array;

public class check_if_an_array_is_sorted_in_ascending_order {
  public static void main(String[] args) {
	int [] arr= {1,3,4,5,25,6,7,8,9,12};
	boolean flag=true;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]>arr[i+1]) {
			System.out.println("Array is not in sorted");
			flag=false;
			break;
		}
	}
	if(flag) {
		System.out.println("Array is sorted ");
	}
}
}
