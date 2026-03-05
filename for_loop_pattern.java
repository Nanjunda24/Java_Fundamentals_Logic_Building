package com.gmail.inbox;

public class for_loop_pattern {
	public static void main(String[] args) {
		System.out.println("Patten Printing...");
		System.out.println();
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i==j) {
				System.out.println("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
		System.out.println();
		}
	}

}
