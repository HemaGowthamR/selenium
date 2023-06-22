package org.javaprogramming;

//import java.util.Scanner;

//public abstract class Addnumbers {
//	//public static void main(String[] args) {
////		int x=10,y=20;
////		int sum;
////		sum=x+y;
////		System.out.println(sum);
////		Scanner sc = new Scanner(System.in);
////		int x = sc.nextInt();
////		int y = sc.nextInt();
//	//} 
//	public abstract void number();
//	
public class Addnumbers{
public static void main(String [] args){
String s = "malayalam";
String result = "";
for(int i=s.length()-1; i<=0; i++){
char c = s.charAt(i);
result = result+c;
}
if(result.equals(s)){
System.out.println(s + "is a palindrome");
}
else{
System.out.println(s + "is not a palindrome");
}
System.out.println(result);
}

}
