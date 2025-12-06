package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class rotate_array_k_positions {
public static void main(String[] args) {
	int [] arr= {1,2,3,4,5,6,7};
	System.out.println("Give the input = ");
	Scanner sc=new Scanner(System.in);
	int output=sc.nextInt();
	
	
	for(int i=0;i<output;i++) {
		int move=arr[arr.length-1];
		for(int j=arr.length-1;j>0;j--) {	
			arr[j]=arr[j-1];			
		}

		
		
		arr[0]=move;
	//	System.out.println(move);
	}
	
	Arrays.stream(arr).forEach(ref->System.out.print(ref));
}
}
