package org.javaprogramming;

public class Vowelsandconsonant {
public static void main(String[] args) {
	String s ="AiShu";
	String s1=s.toLowerCase();
	String vowels = "";
	String consonants = "";
	int countofvowels=0,countofconsonants=0;
	for (int i = 0; i < s1.length(); i++) {
		char c = s1.charAt(i);
		if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			vowels=vowels+c;
			countofvowels++;
		}
		else {
			consonants=consonants+c;
			countofconsonants++;
		}
	}
	System.out.println(" vowels = " + vowels);
	System.out.println(" consonants = " + consonants);
	System.out.println(" countofvowels = " + countofvowels);
	System.out.println(" countofconsonants = " + countofconsonants);
}
}