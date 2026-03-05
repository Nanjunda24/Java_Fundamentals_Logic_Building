/* Logical Operators: (&& , || , !):
 * -It is a binary operator.
 * -The return type of logical operator is always a boolean type.
 * -Logical Operator are used to merge more than one condition.
 * -In java we have the following types of logical operators:
 i) Logical And(&&)
 ii) Logical Or(||)
 iii) Logical Not(!)
 
 */

package com.gmail.inbox;

public class LogicalOperator {
	public static void main(String[] args) {
		
		System.out.println("The Logical Operator..");
		
		//Checking eligible to load apply 
		
		int age =21;
		boolean IsCriminalCase=true;
		
		if(age>=21 && IsCriminalCase==false )
		{
	       	System.out.println("You are eligible to apply loan");
		}
	       	else {
	       		System.out.println("Sorry you are not eligible top apply loan");
	       	}
		
		
	}

}
