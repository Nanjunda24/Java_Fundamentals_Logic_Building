package com.gmail.inbox;

public class Pattern1 {
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println("-------------------------------");
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(j==1|| i==3)
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println("-------------------------------");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++){
				if(j==1|| i==4|j==4||i==1) {
					System.out.print("*");
				}
				System.out.print(" ");
				
			}
			System.out.println();
		}
	
	}

}
