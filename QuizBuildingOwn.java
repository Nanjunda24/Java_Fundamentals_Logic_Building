package com.gmail.inbox;

import java.util.Scanner;

public class QuizBuildingOwn {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int score=0;
		
		System.out.println("Wel come to Quiz ..");
		System.out.println();
		//int answer=(10+20);
		
		System.out.print("Compute the given question  : (10+20)=? : " );
		int answer=scanner.nextInt();
		if(answer==30) {
			System.out.println("Congratulation Your answer is correct!!");
			score++;
		}
		else {
			System.out.println("Sorry you answer is wrong !!");
			score--;
		}
		System.out.print("You score :" +score);
		scanner.close();
		
		
		
	}

}
