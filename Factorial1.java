package com.gmail.inbox;
import java.util.Scanner;

public class Factorial1 {
	public static long factorial(long num) {
		
		if(num==1)
			return 1;
		
		return num*factorial(num-1);   //callback function
					
	}


	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the factoroial number: ");
		long num=s.nextLong();
		
		
		
		System.out.print("the factorial of the enetered number is: " +factorial(num));
		s.close();
		
	}

}
