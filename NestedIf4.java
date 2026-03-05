package com.gmail.inbox;

public class NestedIf4 {
	public static void main(String[] args) {
		
		char gender='F';
		int age =23;
		if(gender=='M') {
			if(age>=21) {
				System.out.println(" Male You can , get marry ");
			}
			else {
				System.out.println("Wait until age 21 ");
			}
		}
		else if(gender=='F' ) {
			if(age>18) {
			
			System.out.println(" Female you can , Get marry ");
		}
			else {
				System.out.println("wait until age 18");
			}
		}
		
		else {
			System.out.println("Invalid  ");
		}
	}

}
