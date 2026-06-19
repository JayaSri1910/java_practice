/* Second Largest Number Finder
Question:
A ranking system receives scores from three participants and needs to determine the second-highest score.
Write a Java program that accepts three integers and finds the second largest number using nested ternary operators.
Test Case 1
Input:
 10 20 30
Output:
 Second largest: 20
Test Case 2
Input:
 50 20 40
Output:
 Second largest: 40
Test Case 3
Input:
 100 300 200
Output:
 Second largest: 200
Test Case 4
Input:
 80 60 70
Output:
 Second largest: 70*/
package com.codegnan.fundamentals;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int seclargest=((a>b && a<c)||(a<b && a>c))?a:((b>a && b<c)||(b<a && b>c))?b:c;
		System.out.println(seclargest);
		sc.close();

	}

}
