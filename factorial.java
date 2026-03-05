package com.gmail.inbox;

public class factorial {
	public int fact(int num) {
		if (num==0) {
			return 1;
		}
		return num*fact(num-1);
	}
	public static void main(String[] args) {
		
		factorial f=new factorial();
		factorial f2=new factorial();
		System.out.println("Factorial of 5:"+f2.fact(5));
		
		int result=f.fact(7);
		
		System.out.println("Factorial: "+result);
		
		int n=5;
		int factorial=1;
		int i=1;
		while(i<=n) {
			factorial=factorial*i;
			i++;
		}
		System.out.println("The factorial of the Given number is: "  +factorial);
		
	}
	

}

