
/*Taxi Fare Calculation (Distance in Kilometers)
Question:
A taxi service company calculates ride fares based on the distance traveled.
• A base fare of ₹50 is charged for the first 2 kilometers.
• ₹15 per kilometer is charged for the next 8 kilometers (from 2 km to 10 km).
• ₹10 per kilometer is charged for every kilometer beyond 10 kilometers.
• If the total distance exceeds 20 kilometers, a 5% discount is applied to the final fare.
Write a Java program that accepts the distance traveled in kilometers and calculates the total taxi fare using nested ternary operators.
Test Case 1
Input:
 2
Output:
 Total fare: 50.0
Test Case 2
Input:
 6
Output:
 Total fare: 110.0
Test Case 3
Input:
 15
Output:
 Total fare: 220.0
Test Case 4
Input:
 25
Output:
 Total fare: 285.0*/
package com.codegnan.fundamentals;

import java.util.Scanner;

public class TaxiFare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance travveled in kilometers:");
		double distance=sc.nextDouble();
		double fare=(distance<=2)?50:(distance<=10)?(50+(distance-2)*15):(50+(8*15)+(distance-10)*10);
		double total=(distance>20)?fare*0.95:fare;
		System.out.println(total);
		sc.close();

	}

}
