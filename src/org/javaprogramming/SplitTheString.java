package org.javaprogramming;

public class SplitTheString {
public static void main(String[] args) {
	String s = "gowthamRH13@gmail.com";
	String uppercase="",lowercase="",digit="",specialcharacter="";
	int countofuppercase=0,countoflowercase=0,countofdigit=0,countofspecialcharacter=0;
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		if (Character.isUpperCase(c)) {
			uppercase=uppercase+c;
			countofuppercase++;
		}
		else if (Character.isLowerCase(c)) {
			lowercase=lowercase+c;
			countoflowercase++;
		}
		else if (Character.isDigit(c)) {
			digit=digit+c;
			countofdigit++;
		}
		else {
			specialcharacter=specialcharacter+c;
			countofspecialcharacter++;
		}	
	}
	System.out.println(uppercase);
	System.out.println(countofuppercase);
	System.out.println(lowercase);
	System.out.println(countoflowercase);
	System.out.println(digit);
	System.out.println(countofdigit);
	System.out.println(specialcharacter);
	System.out.println(countofspecialcharacter);
}
}
