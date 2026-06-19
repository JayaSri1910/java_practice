/*Taxi Fare Calculation (Distance in Meters)
Question:
A taxi service company records trip distances in meters and calculates fares based on the equivalent distance in kilometers.
• A base fare of ₹50 is charged for the first 2000 meters.
• ₹15 per kilometer is charged for the next 8000 meters.
• ₹10 per kilometer is charged for every kilometer beyond 10000 meters.
• If the total distance exceeds 20000 meters, a 5% discount is applied to the final fare.
Write a Java program that accepts the distance traveled in meters and calculates the total taxi fare using nested ternary operators.
Test Case 1
Input:
 2000
Output:
 Total fare: 50.0
Test Case 2
Input:
 6000
Output:
 Total fare: 110.0
Test Case 3
Input:
 15000
Output:
 Total fare: 220.0
Test Case 4
Input:
 25000
Output:
 Total fare: 285.0*/
package com.codegnan.fundamentals;

import java.util.Scanner;

public class TaxiService {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double meters=sc.nextDouble();
		double km=meters/1000;
		double fare=(km<=2)?50:(km>2&& km<=8)?(50+(km-2)*15):(50+8*15+(km-10)*10);
		double total=(km>20)?fare*0.95:fare;
		System.out.println(total);
		sc.close();

	}

}
