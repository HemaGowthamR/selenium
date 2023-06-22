package org.javaprogramming;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1 = "earth", s2="heart";
	char[] c1 = s1.toCharArray();
	char[] c2 = s2.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	String s3 = String.valueOf(c1);
	String s4 = String.valueOf(c2);
	if (s3.equals(s4)) {
		
		System.out.println("it is an anagram");
	} else {
		System.out.println("not an anagram");
	}
}
}
