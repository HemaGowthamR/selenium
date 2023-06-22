package org.javaprogramming;

public class FibonacciSeries {
	static int a=0, b=1, c=8,d;
	public static void main(String[] args) {
		System.out.println(a+" "+b);
		//System.out.println(a);
		//System.out.println(b);
		for (int i = 0; i <=c; i++) {
			d=a+b;
			System.out.println(d);
			a=b;
			b=d;
		}
	}

}
