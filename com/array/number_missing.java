package com.array;

public class number_missing {
	public static void main(String[] args) {
		int[] arr= {25,26,28,30};
		int n=6;
	/*	boolean []result=new boolean[n+1];
		for(int i=0;i<arr.length;i++) {
			result[arr[i]]=true;
		}
		for(int j=1;j<arr.length;j++) {
			if(result[j]==false) {
			System.out.println(j);	
			}
		}
		*/
		
		/////////////////////////////////////////
	/*	
	 
		int result=0;
		for(int i=0;i<arr.length;i++) {
			result=result+arr[i];
		}
		int no=n*(n+1)/2;
		System.out.println(no-result);
		
	}
		*/
		
		// above 2 approch work only when seris start with 1
		
		int min=arr[0];
		for(int i:arr) {
			if(min>i) {
				min=i;
			}
		}
		boolean []result=new boolean[n];
		for(int i=0;i<arr.length;i++) {
			result[arr[i]-min]=true;
		}
		for(int i=0;i<result.length;i++) {
			if(result[i]!=true) {
				System.out.println(min+i);
			}
		}
		
	}
}
