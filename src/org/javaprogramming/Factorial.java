package org.javaprogramming;

public class Factorial {
public static void main(String[] args) {
	int number = 6;
	long factorial = 1;
	for (int i = 0; i <=number; i++) {
		factorial = factorial*i;
	}
	System.out.println(factorial);
}
}
//fact*i
//1*1=1
//1*2=2
//2*3=6
//6*4=24
//24*5=120
//120*6=720