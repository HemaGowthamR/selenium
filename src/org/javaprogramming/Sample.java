package org.javaprogramming;

public class Sample {
	
public static void main(String[] args) {
	String a = "josvik is a boy";
	String b = "";
	String[] c = a.split(" ");
//	for (String d : c) {
//		String e="";
//		for (int i = a.length()-1; i>=0; i--) {
//			char f = a.charAt(i);
//		e=e+f;
//	}
//			b=e+" ";
//	}
//	System.out.println(b);
	
	for (int i = c.length-1; i>=0; i--) {
		
		b=b+c[i]+" ";
	}
	System.out.println(b);
}
}
