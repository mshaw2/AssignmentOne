package com.sessiontwo;

import java.util.Scanner;

/*
 * Write a Java program to allow the user to input his/her age.
 *  Then the program has to show
 *  whether the person is eligible to vote or not.
 */

public class AssignmentOne {

	public static void main(String args[]){
		
				System.out.println("Enter Your Age");
				Scanner sc = new Scanner(System.in);
				int userAge = sc.nextInt();
				sc.close();
				if (userAge >= 18)
				{
					System.out.println("You are eligible to vote");
				}
				else
				{
					System.out.println("You are not eligible to vote");
				}	
	}

}
