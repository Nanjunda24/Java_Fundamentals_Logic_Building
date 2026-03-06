package com.gmail.inbox;
import java.util.Scanner;

public class QuizApp {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Wel come top Quiz !!");
		
		int score=0;
		
		System.out.print("Compute the given question  (10/2): ");
		//started time 
		long startTime=System.currentTimeMillis() ;
		//user input 
		int answer=s.nextInt();
		//end time 
		long endTime=System.currentTimeMillis();
		
		//total time taken 
		long totalTimeTaken=endTime-startTime;
		
		if(answer==5) {
			if(totalTimeTaken<=5000) {
				System.out.println("Congratualtion your are eligible to Bonous points ");
				score+=5;
			}
			else {
				System.out.println("Your answer is correct!!, but you are  too late for bonous points ");
				score+=2;
			}
		}
		else {
			System.out.println("Sorry!! your answer is wrong ");
			score-=2;
		}
		//displaying time taken for answer 
		System.out.println("TimeTaken  : "+(totalTimeTaken/1000.0) +" Seconds");
		
		//Displaying 
		System.out.print("Score :" +score);
		s.close();
		
		
	}

}
