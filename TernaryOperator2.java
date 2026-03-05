package com.gmail.inbox;

public class TernaryOperator2 {
	public static void main(String[] args) {
		
		System.out.println("Ternary Operator : ");
		
		boolean isMember =true;
		double price=100;
		
		double discountPrice=isMember ? price*0.9 : price;
		
		System.out.println("After discount the price is $: " +discountPrice);
	}

}
