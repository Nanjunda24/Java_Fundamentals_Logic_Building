package com.gmail.inbox;

public class NestedIf3 {
	public static void main(String[] args) {
		
		int a=2;
		int b=4;
		int c=10;
		
		if(a>b ) {
			if(a>c) {
				System.out.println("A is greater ");
			}
			else {
				System.out.println("C is greater ");
			}
		}
			else if(b>c) {
				System.out.println("B is greater ");
			}
	
		else
		{
			System.out.println(" C1 is greater ");
		}
		System.out.println("-----------------------------------------------------------");
		if(a>b && a>c) {
			System.out.println("A is greter .");
		}
		else if(b>a&&b>c) {
			System.out.println("B is greater ");
		}
		else {
			System.out.println("C is greater");
		}
	}

}
