package com.gmail.inbox;

public class switch2 {
	public static void main(String[] args) {
		
		System.out.println("Switch case Example ...");
		
		 String day="1";
		
		switch(day) {
		
		case "1": day="Monday";
		break;
		case "2": day="Tuesday";
		break;
		case "3": day ="Wednesday";
		break;
		
		case "4": day="thursday";
		break;
		case "5":day="Friday";
		break;
		case "6":day="Ssaturday";
		break;
		case "7":day="Sunday";
		break; 
	    default: day="Invalid day name !!";
	    break;
		}
		System.out.println("The day is " +day );
		
	}

}
