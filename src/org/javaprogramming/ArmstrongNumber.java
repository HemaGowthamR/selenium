package org.javaprogramming;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number = 128, temporary=number, reminder = 0, result = 1;
		while (number>0) {
			reminder = number%10;
			result = result+(reminder*reminder*reminder);
			number = number/10; 
		}
		if (result==temporary) {
			System.out.println(temporary + "is an armstrong number");
		} else {
			System.out.println(temporary + "is not an armstrong number");
		}
	}
}
