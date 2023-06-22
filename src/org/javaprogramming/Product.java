package org.javaprogramming;

public class Product {
	
	public static void main(String[] args) {
		int number = 128, reminder = 0, result = 1;
		while (number>0) {
			reminder = number%10;
			result = result*reminder;
			number = number/10; 
		}
		System.out.println(result);
		//1*2*8=16
	}

}
