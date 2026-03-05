package com.gmail.inbox;
import java.util.Scanner;

public class QuizOwn2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Wel come to  Java quiz !!");
		System.out.println();
		
		int score =0;
		System.out.print("The Value of X=(300+400) : ");
		long startTime=System.currentTimeMillis();
		
		int answer=sc.nextInt();
		
	    long endTime=System.currentTimeMillis();
	    
	    double timeTaken=endTime-startTime;
	    
	    if(answer==700) {
	    	
	    	if(timeTaken<5000) {
	    		System.out.println("Congratulation your answer is right!! ");
	    		System.out.println("You are eligible to Bonus !!");
	    		score+=10;
	    	}else {
	    		System.out.println("You answer is too late but your answer is correct not eligible for bonus!!");
	    		score+=5;
	    	}}
	    	else {
	    		System.out.println("Your answer is wrong");
	    		score-=5;
	    		
	    		
	    	}
	    System.out.println("The time taken :" +timeTaken/1000.0);
	    System.out.println("Score: "+score);
	    sc.close();	   
	    }
		
		
	}

