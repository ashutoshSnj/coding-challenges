package com.array;

public class remove_duplicate_elements {
  public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,2,3,54};
	int len=arr.length-1;
	for(int i=0;i<=len;i++) {
		for (int j=i+1;j<=len;j++) {
			if(arr[i]==arr[j]) {
			int temp=arr[j]	;
			arr[j]=arr[len];
			arr[len]=temp;
			len--;
			j--;
			}
		}
		
	}
	for (int i=0;i<=len;i++) {
		System.out.println(arr[i]);
	}
}
}
