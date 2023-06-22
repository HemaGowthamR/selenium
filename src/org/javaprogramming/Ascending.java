package org.javaprogramming;
//anagram
public class Ascending {
	public static void main(String[] args) {
		int a[]= {2,8,6,3,9};
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					int temporary = a[i];
					a[i]=a[j];
					a[j]=temporary;
				}
			}
		}
		System.out.println("array after swapping");
		for(int i:a) {
			System.out.println(i + "\t");
		}
		System.out.println("second largest no =" + a[a.length-2]);
		System.out.println("smallest no =" + a[0]);
	}

}
