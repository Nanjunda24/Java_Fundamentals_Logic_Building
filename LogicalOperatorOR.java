package com.gmail.inbox;

public class LogicalOperatorOR {
	public static void main(String[] args) {
		
		int age =16;
		boolean withParents=true;
	
		if (age>18 || withParents==true){
			System.out.println("You can attend party with your parents");
		}
		else {
			System.out.println("You are not eliguble to attend the party, because you are not adult , please bring your parents to attend party");
		}
	}

}
