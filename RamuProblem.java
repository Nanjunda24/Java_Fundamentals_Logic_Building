 /*
 Ramu has 500 rupee with him, he went to cinema where the price is 250 per ticket. in the
 interval he bought popcorn of price 120 rupee, store the given data and display how much may ramu has
 now?
 */

package com.gmail.inbox;

public class RamuProblem {
	
	String name = "Nanjunda K M";
	static String course = "B.E";
	String rollNumber = "1RR22IS028";
	
	
	public void add() {
		int a = 10;
		int b = 12;
		int total2 = a + b;
		System.out.println("Total: ");
	}
     
public static void main(String[] args) {
	
	int total=500;
	int ticket=250;
	int popCon=120;
	int remaining = total - ticket - popCon ;
	System.out.println("Remaing amount after spending all: "+remaining);
	
	RamuProblem r = new RamuProblem();
	RamuProblem r2 = new RamuProblem();
	
	r.name = "Charan H G";
	System.out.println("Name: "+r.name);  //instance varibale accessed via object only without object we can't access instance variable 
	                                       //they belonged to each object 
	r2.name = "Likhith Gowda L";                                        // Each object has it's own copy 
   System.out.println("Second object name: "+r2.name);
}
}
