/*Compound Assignment Operator:-Assignment Op: It is used to update the value to the variable.
 * -Compound Assignment Operator: (+= ,-= , *= , /= , %=)
 * -It is a Binary Operator.
 * -A compound Assignment op is a Combination of Arithmetic op Along with Assignment Op.
 * -We use Compound assignment op whenever we need to update a Variable by Performing Arithmetic
 Op in the RHS
 */
package com.gmail.inbox;

public class CompoundAssignmentOperator {
	public static void main(String[] args) {
		
		System.out.println("The Compound assignment operator ..used for ressign the value or increment the value ");;
		
		int num=10; 
		
		num+=20;  //we can declare this way also num=num+20.
		
		System.out.println("After the ressign :" +num);
		
		num=num*12;
		
		System.out.println("After the multplication operator :" +num);
		
		num/=2;
		
		System.out.println("After the division :" +num);
		
		num%=3;
		
		System.out.println("After the modulus applied :"  +num);
		
		
	}

}
