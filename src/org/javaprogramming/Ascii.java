package org.javaprogramming;

public class Ascii {
	public static void main(String[] args) {
		String s = "gowthamRH13@gmail.com";
		String uppercase="",lowercase="",digit="",specialcharacter="";
		int countofuppercase=0,countoflowercase=0,countofdigit=0,countofspecialcharacter=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int x=c;
			if (x>=65 && x<=90) {
				uppercase=uppercase+c;
				countofuppercase++;
			}
			else if (x>=97 &&x<=122) {
				lowercase=lowercase+c;
				countoflowercase++;
			}
			else if (x>=48 && x<=57) {
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
