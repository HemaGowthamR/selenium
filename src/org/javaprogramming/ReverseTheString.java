package org.javaprogramming;

public class ReverseTheString {
	public static void main(String[] args) {
		//1.using reverse() method under stringBuilder class
		String a="my name is Gowtham";
		StringBuilder s = new StringBuilder(a);
		StringBuilder reverse1 = s.reverse();
		System.out.println(reverse1);
		
		//2.USING FOR LOOP
		String s1 = "my name is Gowtham";
		String reverse ="";
		for(int i=s1.length()-1; i>=0; i--) {
			char c = s1.charAt(i);
			reverse = reverse+c;
		}
		System.out.println(reverse);
		
		//3
		String[] d = s1.split(" ");
		for(int i=d.length-1; i>=0; i--) {
			reverse = reverse+" "+d[i];
		}
		System.out.println(reverse);	
	}
	
}

