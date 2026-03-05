package com.gmail.inbox;

public class pattern {
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {
			for( int j=1;j<=3; j++) {
				if(i==3||j==1||j==3||i==1)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println();
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==1||i==5||j==5||i==1)
					System.out.print("*");
				else 
					System.out.print(" ");
				
			}
			System.out.println( );
		}
		System.out.println( );
		
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i%2!=0)
					System.out.print("1");
				else
				System.out.print("0");	
			}
			System.out.println();
		}
		
		
		
		
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6;j++) {
				if(j%2==0) {
					System.out.print("1");
				}
					else {
						System.out.print("0");
				}
				System.out.print(" ");
			}
		}
		
		
		System.out.println();
		
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(j==1||j==2||j==3) 
					System.out.print("123");
					
						//System.out.println(" ");
					
				}
			System.out.println();
			}
		}
	} 





