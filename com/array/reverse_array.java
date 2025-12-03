package com.array;

public class reverse_array {
 public static void main(String[] args) {
	int [] arr= {1,2,3,4,56,7,8,6,4689,90};
	int j=arr.length-1;
	for(int i=0;i<arr.length/2;i++) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		j--;
	}
	for(int no:arr) {
		System.out.println(no);
	}
}
}
