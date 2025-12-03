package com.array;

public class Largest_Element {
	
public static void main(String[] args) {
	int arr[] = {1,2,3,4,6,4,32,5,7,8};
	int result=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(result<arr[i]) {
			result=arr[i];
			
		}
		
		
	}
	System.out.println(result);
}



}
