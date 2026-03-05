package com.gmail.inbox;

public class Pattern12 {
	public static void main(String[] args) {
		
		        int n = 5;  // Size of the triangle

		        for (int i = 1; i <= n; i++) {  // Loop for each row
		            for (int j = 1; j <= i; j++) {  // Loop for each column in a row
		                // Print starts for the first and last column of each row
		                if (j == 1 || j == i || i == n) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");  // Hollow space in between
		                }
		            }
		            System.out.println();  // Move to the next line after each row
		        }
		    }
		

	}


