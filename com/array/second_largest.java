package com.array;

public class second_largest {

  public static void main(String[] args) {
	int [] arr = {1,2,3,5,6,7,8,6,4,6,89,45};
	int first=arr[0];
	int second=0;
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>first) {
		  second=first;
		  first=arr[i];
		}
		else if (arr[i]<first && arr[i]>second) {
			second=arr[i];
		}
	}
	System.out.println(second);
	
}
}
