package com.gmail.inbox;
import java.util.Scanner;


public class QuizOwn3 {
	public static void main(String[] args) {
		
		System.out.println("Wel come to JAVA quiz.. ");
		
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		
		int score=0;
		
		System.out.println("What is the value of  (100+200) : ");
		
		long startTime=System.currentTimeMillis();
		
		int answer=sc.nextInt();
		
		long endTime=System.currentTimeMillis();
		
		long timeTaken=endTime-startTime;
		
		if(answer==300) {
			System.out.println("Congratulation your answer is correct !!");
			if(timeTaken<=5000) {
				System.out.println("You are eligible to bonus ");
				score+=10;
			}
			else {
				System.out.println("You are too late not eligible to Bonus but answer is Right normal score is credited!!");;
				score+=5;
			}
		}
			else {
				System.out.println("Sorry you  entered answer is wrong!!!, Penalty is awarded");
				score-=5;
		
		}
		System.out.println("Time Taken : " +timeTaken/1000.0 +"sec");
		System.out.print("Score :" +score );
		sc.close();		
		}
		
		
		
		
	}


