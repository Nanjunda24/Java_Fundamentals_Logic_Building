package com.gmail.inbox;
import java.util.Scanner;

public class Method {
	
	public static int test(int a ,int b) {
      	System.out.println("Sum:" +(a+b));
		return a+b ;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y;
		 int sum = test( x=sc.nextInt(),y=sc.nextInt());
		
		System.out.println("The value of x is :" +x);
		System.out.println("The value of y is : "+y);
		System.out.println("The sum is :"+sum);
		
		sc.close();
}
}
