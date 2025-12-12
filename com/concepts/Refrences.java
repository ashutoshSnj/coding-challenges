package com.concepts;

import java.util.Arrays;

public class Refrences {
  public void getint() {
	  System.out.println("Int metodd call");
  }
  public void getint(String str) {
	  System.out.println("Strong method call");
  }
  public void getint(Object obj) {
	  System.out.println("object method cll");
  }
 public static void main(String[] args) {
	 Refrences tra=new Refrences();
	//tra.getint(125);
	
	int arr[]=new int[] {1,2,43,5,6};
	int ptr[]=arr;
	ptr[0]=123;
	
	Arrays.stream(arr).forEach(ref->System.out.println(ref));
	String str="ashutosh";
   String ptr1=str;
   ptr1.concat("ok");
  System.out.println(ptr1+" "+str);
	
}
}
