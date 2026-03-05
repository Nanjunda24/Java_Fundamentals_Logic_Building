package com.gmail.inbox;
import java.util.Scanner;

public class QuizApplication {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int score=0;
		System.out.println("Wel come to quiz application ");
		System.out.println();
		
		System.out.print("What is the value of Given expression(100+200) : ");
		
		long startTime=System.currentTimeMillis();
		
		int answer=sc.nextInt();
		
		long endTime=System.currentTimeMillis();
		
		long timeTaken=endTime-startTime;
		
		if(answer==300 && timeTaken<5000 ) {
			System.out.println("Congratulation your answer is correct!! and also You are eligible to Bonous reward: ");
			score+=10;
		}
		
		else if(answer==300 && timeTaken>5000) {
			System.out.println("Your answer is correct but not eligible for Bonous because you are too late!!.");
			score+=5;
		}
		else {
			System.err.println("Your Answer is wrong!!!!");
			score-=5;
		}
		
		
		System.out.println("Time taken :" +timeTaken/1000.0);
		System.out.println("Score: " +score);
		
	}
	
	
	}
	


