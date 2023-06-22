package org.javaprogramming;

public class Swapping {
	public static void main(String[] args) {
		
	
	  int a = 10, b = 20;

      System.out.println("--Before swap--");
      System.out.println("First number = " + a);
      System.out.println("Second number = " + b);

     a=a+b; //a=10+20=30
     b=a-b; //b=30-20=10
     a=a-b; //a=30-10=20

      System.out.println("--After swap--");
      System.out.println("First number = " + a);
      System.out.println("Second number = " + b);
}
}