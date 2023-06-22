package org.javaprogramming;

public class FibonacciOrNot {
	
	public static void main(String[] args) {
		int a=0,b=1,c=100,num=89,d=0;
		for(int i=0; i<c; i++) {
			if(d<=num) {
				d=a+b;
				a=b;
				b=d;
				if(d==num) {
					System.out.println(num + " is a fibonacci ");
					break;
				}
				if(d>num) {
					System.out.println(num + " is not a fibonacci ");
					break;
				}
			}
		}
	}

}
