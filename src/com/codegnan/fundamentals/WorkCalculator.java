/* Problem Statement-5)
A software company assigns three developers — Alex, Brian, and Charles — to complete a critical project module.
Alex and Brian together can complete the work in a certain number of days.
Brian and Charles together can complete the same work in another number of days.
Alex and Charles together can complete it in another number of days.
The project manager wants to know how many days all three developers working together will take to complete the project.
Write a Java program that accepts:
Days taken by Alex and Brian
Days taken by Brian and Charles
Days taken by Alex and Charles
from the end user and calculates the number of days required for all three developers together to finish the work.
Input Format
Enter Days Taken by A and B
Enter Days Taken by B and C
Enter Days Taken by A and C

Output Format
All Three Can Complete Work In X days

Constraints  
1 <= Days <= 100
Hint to Solve the Problem
Combined work formula:
2(A+B+C)=(A+B)+(B+C)+(A+C)
After finding total work efficiency:
                  1
Days =   —--------
              A+B+C

Sample Test Case 1 
Input 
12
15
20
Output 
All Three Can Complete Work In 10 days
Sample Test Case 2
Input
8
12
24
Output 
All Three Can Complete Work In 6 days*/


package com.codegnan.fundamentals;

import java.util.Scanner;

public class WorkCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter days taken A and B");
		int ab=sc.nextInt();
		System.out.println("Enter days taken B and C");
		int bc=sc.nextInt();
		System.out.println("Enter days taken C and A");
		int ca=sc.nextInt();
		double rate=((1.0/ab)+(1.0/bc)+(1.0/ca))/2.0;
		int days=(int)(1/rate);
		System.out.println("All three can complete work in " +days+ " days ");
		sc.close();

	}

}
