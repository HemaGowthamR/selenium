package org.javaprogramming;


public class FirstLetterCapital {
public static void main(String[] args) {
	String s = "java programming", result="";
	String[] split = s.split(" ");
	for (int i = 0; i < split.length; i++) {
		String each = split[i];
		//System.out.println(each);
		char c = each.charAt(0);
		//System.out.println(c);
		char upperCase = Character.toUpperCase(c);
		//System.out.println(upperCase);
		String substring = each.substring(1);
		//System.out.println(substring);
		result=result+upperCase+substring+" ";	
	}
	System.out.println(result);
}
}
