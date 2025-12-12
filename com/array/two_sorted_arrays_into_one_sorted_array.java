package com.array;

import java.util.Arrays;

public class two_sorted_arrays_into_one_sorted_array {
   public static void main(String[] args) {
	int[]   arr = {1, 3, 5};
	int []   brr = {2, 4, 6};
	int lenght=arr.length+brr.length;
	int [] result=new int [lenght];
	int count=0;
	/*for(int i=0;i<arr1.length;i++) {
		if(arr1[i]>arr2[i]) {
			result[count++]=arr2[i];
			result[count++]=arr1[i];
		}
		else {
			result[count++]=arr1[i];
			result[count++]=arr2[i];
		}
	}*/
	int i=0;int j=0;int k=0;
	while(arr.length>i && brr.length>j) {
		if(arr[i]>brr[j]) {
			result[k++]=brr[j++];
		}
		else {
			result[k++]=arr[i++];
		}
	}
	while(arr.length>i) {
		result[k++]=arr[i++];
	}
   while(brr.length>j) {
		result[k++]=brr[j++];
	}
	Arrays.stream(result).forEach(ref->System.out.println(ref));

}
}
