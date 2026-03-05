package com.gmail.inbox;

public class LogicalOperatorAND1 {
	public static void main(String[] args) {
		
		//validating user id and password
		
		int  userId= 12345;
		String password="Nanjunda@2004";
		
		if(userId==12345 && password=="Nanjunda@2004") {
			System.out.println("Login Successfull !..");
		}
		else {
			System.out.println("Invalid credentials, Check again !");
		}
		
		
	}

}
