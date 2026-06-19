/*Question:
A calculator application allows users to perform basic arithmetic operations on two numbers.
Menu:
• 1 → Addition
• 2 → Subtraction
• 3 → Multiplication
• 4 → Division
If the user selects division, the program must check for division by zero.
Write a Java program using a switch statement to perform the selected operation.
Input Format:
The first line contains a double value representing the first number.
The second line contains a double value representing the second number.
The third line contains an integer representing the operation choice.
Output Format:
Display the result of the selected operation.

Sample Test Case 1
Input:
 10
 20
 1
Output:
 Result: 10.0 + 20.0 = 30.0

Sample Test Case 2
Input:
 50
 20
 2
Output:
 Result: 50.0 - 20.0 = 30.0

Sample Test Case 3
Input:
 10
 5
 3
Output:
 Result: 10.0 * 5.0 = 50.0

Sample Test Case 4
Input:
 20
 0
 4
Output:
 Error: Division by zero is not allowed.
-------------------------------------------------------------------------------------------*/
package com.codegnan.fundamentals;

import java.util.Scanner;

public class ArithematicOperationCalc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		double a=sc.nextDouble();
		System.out.println("Enter b value");
		double b=sc.nextDouble();
		System.out.println("Enter choice:");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			double Addition=a+b;
			System.out.println("Addition:"+Addition);
			break;
		case 2:
			double Subtraction=a-b;
			System.out.println("Subtraction:"+Subtraction);
			break;
		case 3:
			double Multiplication=a*b;
			System.out.println("Multiplication:"+Multiplication);
			break;
		case 4:
			if(b==0) {
				System.out.println("Error: Division by zero is not allowed");
			}
			else {
				double Division=a/b;
			    System.out.println("Division:"+Division);
			break;
		}
		}
		sc.close();
	}

}
