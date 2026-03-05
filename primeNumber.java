package com.gmail.inbox;

public class primeNumber {
   public static void main(String[] args) {
	
	   
	   int num=12;
	   int count=0;
	   for(int i=1; i<=num/2; i++) {
		   if(num%i==0) {
			   count++ ;
		   }
	   }
		   
		   if(count==1) {
			   System.out.println( "The Given  number is  Prime Number "  );
		   }
			   else {
				   System.out.println("The number is not  Prime number ");
			   }
		   }
	   }

