package com.gmail.inbox;

public class NestedIf2 {
	public static void main(String[] args) {
		
		boolean isCardValid=true ;
		float accountBalance=5000F;
		float withdrawalBalance=20000F;
		
		if(isCardValid) {
			if(accountBalance >= withdrawalBalance) {
			   System.out.println("You can withdraw your money ");
				
			}
			else {
				System.out.println("Insufficient balance ");
			}
		}
		else {
			System.out.println("Invalid Card detauils ");
		}
		
	}

}
