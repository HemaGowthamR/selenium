package org.javaprogramming;

public class Palindrome {
	
	public static void main(String[] args) {
		String a = "malayalam";
		String b = "";
		for (int i = a.length()-1; i>=0; i--) {
			char c = a.charAt(i);
			b=b+c;
		}
		if (b.equals(a)) {
			System.out.println(a+ " is a palindrome \n" +a.length());
		}
		else {
			System.out.println(a+ " is not a palindrome");
		}
	}
}
//	public static void main(String[] args) {
//		int number=121,reminder=0,result=0,temporary=number; 
//		while (number>0) {
//			reminder=number%10;
//			result=(result*10)+reminder;
//			number=number/10;
//		}
//			if (temporary==result) {
//				System.out.println(temporary+ " is a palindrome ");	
//			}
//			else {
//				System.out.println(temporary+ " is not a palindrome ");
//			}
//			
//			
//		}
//
//}
