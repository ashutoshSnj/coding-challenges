package com.array;

public class count_even_and_odd_numbers {
  public static void main(String[] args) {
	int arr[]= {12,43,4,56,7,456,7535,654};
	int even=0 ,odd=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			even++;
		}
		else {
			odd++;
		}
	}
	System.out.println("Even No Count = "+even+ " Odd No Count = "+odd);
}
}
