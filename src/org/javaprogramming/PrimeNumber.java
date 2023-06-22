package org.javaprogramming;

public class PrimeNumber {
public static void main(String[] args) {
int number = 4, count=0;
for(int i=1; i<=number; i++) {
	if(number%i==0) {
		count=count+1;
	}
}
if(count==2) {
	System.out.println(number + " is a prime number");
}
else {
	System.out.println(number + " is not a prime number");
}
}
}

