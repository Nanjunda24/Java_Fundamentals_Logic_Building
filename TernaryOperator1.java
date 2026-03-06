package com.gmail.inbox;

public class TernaryOperator1 {
	public static void main(String[] args) {
		
		System.out.println("----Ternary operator Demo-----");
		
      int age = 21 ;
      
      boolean isDebitCard = true ;
      
      String result = (age >= 21 && isDebitCard) ? "You are eligible to apply debit card ": "You are not eligible to apply debit card" ;
		
      System.out.println("Result: "+result);
	}

}
