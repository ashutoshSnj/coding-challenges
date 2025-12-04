package com.string;

import java.lang.reflect.Array;
import java.util.Scanner;

public class reverse_each_word {
	static char[]arr;
  public static void main(String[] args) {

		System.out.println("Enter the String = ");
		Scanner sc=new Scanner (System.in);
		String input=sc.nextLine();
		arr= input.toCharArray();
		int start=0;
		int i=0;
		for( i=0;i<arr.length;i++) {
			if(arr[i]==' ') {
				chanchArray(i-1,start);
				start=i+1;
			}
		}
	
		chanchArray(i-1, start);//becose in loop last word not chache 
		System.out.println(arr);
}

public static void chanchArray(int end, int start) {
	
	for(int i=start;i<end;i++) {
		char temp=arr[i];
		arr[i]=arr[end];
		arr[end]=temp;
		end--;
	} /*
	 while (start < end) {
	        char temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
	    } */
}
}
