package com.Logic;

public class Amtrong_NO {
  public static void main(String[] args) {
	int no=153;
	int temp=no;
	int count=0;
   while(temp>0) {
	 temp=  temp/10;
	 count++;
   }
   System.out.println(count);
int result=0;
   while(no>0) {
	  int num=no%10;
	  int each=1;
	  for(int i=1;i<=count;i++) {
		 each=each*num;
	  }
	  result=result+each;
	  no=no/10;
   }
   System.out.println(result);
   
}
}
