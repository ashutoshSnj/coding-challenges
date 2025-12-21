package com.array;

import java.util.Arrays;

public class move_all_zeros_to_the_end {
    public static void main(String[] args) {
		int arr[]= {1,0,0,0,1,3,4,5,0,8};
		int length=arr.length-1;
	/*	for(int i=0;i<length;i++) {
			if(arr[i]==0) {
				for(int j=i;j<length;j++) {
					arr[j]=arr[j+1];
				}
				arr[length--]=0;
				i--;
			}
		}*/
      int ind=0;
	for(int i=0;i<arr.length;i++) {
		 if(arr[i]!=0) {
			 arr[ind]=arr[i];
			 ind++;
		 }
	}
	while(ind<arr.length) {
		arr[ind]=0;
		ind++;
	}
		Arrays.stream(arr).forEach(ref->System.out.print(ref+" "));
	}
}
