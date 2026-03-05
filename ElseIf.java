package com.gmail.inbox;
import java.util.Scanner;

public class ElseIf {
	public static void main(String[] args) {
//		System.out.println("Else if ladder!!! ");
//		
//		System.out.println("Finding Score grading system !!!");
//		Scanner sc= new Scanner(System.in);
//		
//		int reward=0;
//		System.out.print("Enter your score : ");
//		
//		long startTime=System.currentTimeMillis();
//		int scoredMarks=sc.nextInt();
//		long endTime=System.currentTimeMillis();
//		long timeTaken=endTime-startTime;
//		if(scoredMarks<35) {
//			
//			System.out.println("You failed in the Exam!! ");
//			
//		}
//		else if(scoredMarks>35&&scoredMarks<=50) {
//			System.out.println("Congratulation you got C+ grade  ");
//		}
//		else if(scoredMarks>50 && scoredMarks<=65) {
//			System.out.println("Congratualation you got B grade");
//		}
//		else if(scoredMarks>65&&scoredMarks<=75) {
//			System.out.println("Congratulation you got B+ grade ");
//		}
//		else if(scoredMarks>75&&scoredMarks<=85) {
//			System.out.println("Congratulation you got A grade ");
//		}
//		else if(scoredMarks>85&&scoredMarks<=100) {
//			System.out.println("Congratualtion you got A++ grade !!");
//		}
//		else {
//			System.out.println("Score should be  in the  form of number ");
//		}
//		double totalTime= (timeTaken/1000.0);
//		
//		System.out.println("Time taken :"+timeTaken/1000.0);
//		System.out.println("Total time in seconds taken : " +totalTime);
//		if(totalTime<5) {
//			System.out.println("Congrats you eligible to reward");
//			reward+=1;
//			
//		}
//		else {
//			System.out.println("Not eligible to reward,Because too late penalty is awarded!! ");
//			reward-=1;
//		}
//		System.out.println("Rewards: " +reward);
//		sc.close();
//		
		System.out.println("Student grade system with grade calculation and rewards!!!");
		Scanner sc = new Scanner(System.in);
		int reward = 0;
		System.out.print("Compute the exapression (10 + 20): ");
		long startTime = System.currentTimeMillis();
		int answer = sc.nextInt();
		long endTime= System.currentTimeMillis();
		double timeTaken = (endTime - startTime)/1000.0;
		
		
		 System.out.print("Enter student marsks: ");
		 int marks = sc.nextInt();
		 
		 if (marks >90) {
			 System.out.println("Student got A++ ");
		 }
		 else if(marks > 80 && marks < 90) {
			 System.out.println("Student got A ");
		 }
		 else if(marks > 70 && marks < 80) {
			 System.out.println("Student got B++ ");
		 }
		 else if (marks > 50 && marks< 70) {
			 System.out.println("Stduent got B");
		 }
		 else {
			 System.out.println("Student has Failed!!!");
		 }
		 
		 if(answer ==  30 && timeTaken < 5) {
			 System.out.println("COngrats you are eligible to recieve reward!!!!");
			 reward +=1;
		 }
		 
		 else {
			 System.out.println("You not eigible to recieve the reward thaank you!!!!");
		 }
		 System.out.println("----------------------------------------------------");
		
		 System.out.println("Time taken : "+timeTaken);
		 System.out.println("Grade : "+marks);
		 System.out.println("Reward: "+reward);
		 
	}

}
