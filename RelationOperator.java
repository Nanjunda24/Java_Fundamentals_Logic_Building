/*
 *  Relational Operator:-It is used to Compare two values.(==,!=,>,<,>=,<=)-It is Binary Operator.-Return Type of relational Operator is Always Boolean.
 Note: Except For == And != Operator boolean datatypes cannot be used for other relational operator
 */
package com.gmail.inbox;

public class RelationOperator {
	public static void main(String[] args) {
		
		System.out.println("Relation operator : ==.!=,<,>,>=,<=, these operation give three result in thge form of Boolean value :true, or false :");
		
		int a=10;
		int b=30;
		System.out.println("The value of  a " +a );
		System.out.println("The value of  b" +b);
		
		char ch='a';
		char $ch='b';
		
		System.out.println("Is a equals to b:" +(a==b));
		System.out.println("a is not equal to : " +( a!=b));
		System.out.println("Is a is greater than b :"  +(a>b));
		System.out.println("Is a is lesser than b : " +(a<b));
		System.out.println("Is a is greater than or equal to  b:" +(a>=b));
		System.out.println("Is a is lesser than or equal to b:" +(a<=b));
		System.out.println("Is ch  is ngreater than the $ch: " +(ch>$ch));
		System.out.println("Is is b is greater than the a : " +(b>a));
		
		
		
	}
}
