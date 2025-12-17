package com.Logic;

public class Swap_TO_NO_Without_Using_Third {
    public static void main(String[] args) {
		int a=10;
		int b=20;
		// xor exclusivlly or oprater work only binnary no it internlly conver decimal to binnary 
		// then iff same than it reutn 0 and iff diifernt binary then it return 1
		// bassiclly xor= iff smae then 0 false and iff differnt that time 1 or true
		a = a ^ b; 
		b = a ^ b;
		a = a ^ b;

	//	System.out.println("a = " + a + ", b = " + b);
		
		int no1=10;
		int no2=20;
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println(no1+" "+no2);
	}
}
/*
 
int a = 10;
int b = 20;

// Step 1:
// a stores XOR of original a and b
// a = a ^ b  → 10 ^ 20 = 30
a = a ^ b;

// Step 2:
// b = (a ^ b)
// => (a ^ b) ^ b
// => original a
// b gets original value of a (10)
b = a ^ b;

// Step 3:
// a = (a ^ b)
// => (a ^ original a)
// => original b
// a gets original value of b (20)
a = a ^ b;

*/