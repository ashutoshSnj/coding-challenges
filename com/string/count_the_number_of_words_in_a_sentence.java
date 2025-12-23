package com.string;

public class count_the_number_of_words_in_a_sentence {
   public static void main(String[] args) {
	String str="Ashutosh Sanjay Shelke ";
	int count=1;
  for(int i=0;i<str.length()-1;i++) {
	  if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
		  count++;
	  }
  }
  System.out.println("String Contain "+count+" Words");
}
}
