package com.string;

import java.util.Scanner;

public class convert_a_string_to_an_integer {
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);	
    	   System.out.println("Enter the String = ");
        String str=sc.nextLine();
 //       int no=Integer.parseInt(str); // return int 
 //       int num=Integer.valueOf(no);// return Integer object ref do autoboxing
     //   System.out.println(no);
       // System.out.println(String.valueOf(str));
        /*
         int ok='2';
         char ch=84;
         System.out.println(ch);
         */
        
      int min=1;
      int i=0;
      int result=0;
      boolean flag=true;
      if(str.charAt(0)=='-') {
    	  min=-1;
    	  i=1;
      }
      
     
      for(;i<str.length();i++) {
    	  char temp=str.charAt(i);
    	if(temp>='0'&&temp<='9') {
    		          //-48 becose zero assc value is 48
    		int no1=temp-'0';
    		System.out.println(no1+" ");
    		result=result*10+no1;
    	}
    	else {
    		System.out.println("This String Contain non Numeric char ");
    	  flag=false;
    		break;
    	}
      }
    result=result*min;
      if(flag) {
    	  System.out.println("No is = "+result);
      }
        
	}
}
