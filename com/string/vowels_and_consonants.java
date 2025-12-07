package com.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class vowels_and_consonants {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the String = ");
	String str=sc.nextLine();
	final int var;

	List <Character> Vowels=new ArrayList<Character>();
	List <Character> Consonants=new ArrayList<Character>();
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			Vowels.add(ch);
		}
		else {
			Consonants.add(ch);
		}
	}
	System.out.println("Vowels is = ");
	Vowels.stream().forEach(ref->System.out.print(ref+" "));
	System.out.println();
	System.out.println("Consonants is = ");
	Consonants.stream().forEach(ref->System.out.print(ref+" "));
}
}
