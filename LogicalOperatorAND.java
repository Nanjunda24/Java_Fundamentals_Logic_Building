package com.gmail.inbox;

public class LogicalOperatorAND {
	public static void main(String[] args) {
		
		int age = 18;
		
        boolean withParent=true;
        
        if(age>=18 && withParent==true) {
        	System.out.println("You are eligible to attend Party ");
        }
        else {
        	System.out.println("Yopu ar enot eligible to attend Party ");
        }
	}

}
