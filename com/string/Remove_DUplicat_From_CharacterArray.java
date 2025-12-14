package com.string;

public class Remove_DUplicat_From_CharacterArray {
       public static void main(String[] args) {
		String str="abbcdae";
		char[]arr=str.toCharArray();
		int length=arr.length-1;
		// order not maintain direct last element are put 
	/*	for(int i=0;i<length;i++) {
			for(int j=i+1;j<=length;j++) {
				if(arr[i]==arr[j]) {
					char temp=arr[j];
					arr[j]=arr[length];
				    arr[length]=temp;
				    length--;
				    j--;
				}
			}
		}*/
		
		// order maintain
		
		
		
		
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<=length;j++) {
				
				if(arr[i]==arr[j]) {
					char temp=arr[j];
				for(int k=j;k<length;k++) {
					arr[k]=arr[k+1];
				}
			//   arr[length]=temp;
			   length--;
			   j--;
				}
			}
		}
		
		for(int i=0;i<=length;i++) {
			System.out.print(arr[i]);
		}
	}
}
