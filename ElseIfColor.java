package com.gmail.inbox;
import java.util.Scanner;

public class ElseIfColor {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your favorite color :");
		
		String color=sc.nextLine();
		
		if(color.equals("red") ){
			System.out.println("Your favorite color is Red ");
		}
		else if(color.equals("green")) {
			System.out.println("Your entered color is Green");
		}
		else if(color.equals("white") ){
			System.out.println("You entered color is white ");
		}
		else if(color.equals("pink")) {
			System.out.println("You entered color is Pink");
		}
		else if(color.equals("black")) {
			System.out.println("You entered color is black");
		}
		else {
			System.out.println("Enter a valid color name ");
		}
		sc.close();
		
		
		
		
		
	}


}
