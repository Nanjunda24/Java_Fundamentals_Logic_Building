package com.gmail.inbox;

public class ForLoop {
	public static void main(String[] args) {
		
		for (int i=1;i<=5;i++) {
			System.out.println("Hello " +i);
		}
		System.out.println("----------------------------------------------");
		
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println("-----------------------------------------------");
		
		for(int i=5;i>=1;i--) {
			System.out.println("hello "+i);
		}
		System.out.println("-----------------------------------------------");
		
		for(int i=2;i<=10;i+=2) {
		   System.out.println(i);
			
		}
		System.out.println("-----------------------------------------------");
		int sum=0;
		for(int i=0;i<=10;i++) {
			sum=sum+i;
		}
		System.out.println("Sum :" +sum);
	}

}
