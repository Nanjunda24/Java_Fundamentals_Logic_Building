// Arithmetic Operator: It is a Binary operator which are used to perform arithmetic operators(+,/,
// ,*,%)
// + do the two operation one is addition, second ine os concatenation.


package com.gmail.inbox;

public class ArithmeticOperators {
	public static void main(String[] args) {
		
		System.out.println("Arithmetic operators : +, -. * ,/, %");
		
		int a=10;
		int b=20;
		String greeting =" Hello JAVA";
		String str= "World !";
		
		System.out.println("Addtion of :" +(a+b));
		System.out.println("Substraction of :" + (a-b));
		System.out.println("Multiplication of:" +(a*b));
		System.out.println("Division of a/b:" +(a/b));
		System.out.println("Modulus of a and b :" +(a%b));
		System.out.println("Multiplication of :" +(a*2));
		
		//concatenation 
		
		System.out.println(greeting+" " + str);
		
		
	}

}
