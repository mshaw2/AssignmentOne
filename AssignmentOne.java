package com.sessionone;

/* Write a program to print the sum of two numbers. 
 * One number should be int and another should be float.
 * 
 */
public class AssignmentOne {
	public static void main(String[] args) {
		int firstnumber=10;
		float secondnumber=10.67f;
		float sum = firstnumber + secondnumber;
		System.out.println("The sum without Typecasting is "+ sum);
		sum = (int)sum; //Type casting float to integer
		System.out.println("The sum after Typecasting is "+ sum);
	}
}
