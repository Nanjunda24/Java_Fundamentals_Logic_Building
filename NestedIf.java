package com.gmail.inbox;
import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter your userName : ");
		String userName=s.next();
		System.out.print("Enter your password : ");
		String Password=s.next();
		
		//String userName="Nanjunda";
		//String Password="Nanjunda@2004";
		
		if(userName.equals("Nanjunda")) {
			System.out.println("User name is correct");
			if(Password.equals("Nanjunda@2004")){
				System.out.println("Wel come to home page ");
			}
				else {
					System.out.println("Password is incorrect ");
				}
		}
			else {
				System.out.println("Incorrect userName");
			}
		s.close();
			
		}
	} 


