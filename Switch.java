package com.gmail.inbox;
import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Number that should be < 10: ");
		
		int num=sc.nextInt();
		
		switch(num) {
		
		case 1: System.out.println("Entered number is 1");
		break;
		case 2: System.out.println("You entered number is 2");
		break;
		case 3: System.out.println("You entered number is 3");
		break;
		case 4:System.out.println("You entered number is 4");
		break;
		case 5:System.out.println("You entered number is 5");
		break;
		default : System.out.println("You entered invalid number ");
		}
		sc.close();
	}

}
