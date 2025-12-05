package com.array;
import java.util.Arrays;

public class reverse_an_array {
  public static void main(String[] args) {
	  
	int [] arr= {1,2,78,56,34,990,0,564};
	int count=arr.length-1;
	for(int i=0;i<arr.length/2;i++) {
		int temp=arr[i];
		arr[i]=arr[count];
		arr[count]=temp;
		count--;	
	}
   Arrays.stream(arr).forEach(ref-> System.out.println(ref));  
}

}
