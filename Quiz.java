


package com.gmail.inbox;
import java.util.Scanner;


public class Quiz {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int score = 0;

	        System.out.println("Answer quickly to get bonus points!");
	        
	        System.out.println("Question: What is 5 + 3? :  ");

	        // Record the start time
	        long startTime = System.currentTimeMillis();

	        // Take user's answer
	        int answer = scanner.nextInt();

	        // Record the end time
	        long endTime = System.currentTimeMillis();

	        // Calculate time taken (in milliseconds)
	        long timeTaken = endTime - startTime;

	        // Check answer
	        if (answer == 8) {
	            if (timeTaken <= 5000) { // within 5 seconds
	                score += 2; // Bonus points
	                System.out.println("Correct and fast! Bonus points awarded!");
	            } else {
	                score++; // Normal point
	                System.out.println("Correct but a bit slow! Normal point awarded.");
	            }
	        } else {
	            score--; // Wrong answer penalty
	            System.out.println("Wrong answer! Penalty applied.");
	        }

	        System.out.println("Time taken: " + (timeTaken/1000.0) + " seconds");
	        System.out.println("Final Score: " + score);

	        scanner.close();

	}

}
