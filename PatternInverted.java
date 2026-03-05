package com.gmail.inbox;

public class PatternInverted {
	public static void main(String[] args) {
		
		//inverted triangle
		
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
