package org.javaprogramming;

public class PrintPrimeNumbers {
	 public static void main(String[] args) {
		 int number = 20; 
		 for(int i=2; i<=number; i++) {
			 int count=0;
			 for(int j=1;j<=i; j++) {
				 if(i%j==0) {
					 count = count+1;
				 }
			 }
			 if(count==2) {
				 System.out.println(i);
			 }
		 }
}
}
