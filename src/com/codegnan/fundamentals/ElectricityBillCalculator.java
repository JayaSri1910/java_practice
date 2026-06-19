/*Electricity Bill Calculator
Question:
An electricity department charges consumers based on their monthly power consumption.
• Up to 100 units: ₹2 per unit
• 101 to 300 units: ₹4 per unit
• Above 300 units: ₹6 per unit
• If consumption exceeds 500 units, a 5% surcharge is added to the bill.
Write a Java program that accepts the number of units consumed and calculates the total electricity bill using nested ternary operators.
Test Case 1
Input:
 80
Output:
 Total Bill: 160.0
Test Case 2
Input:
 200
Output:
 Total Bill: 800.0
Test Case 3
Input:
 400
Output:
 Total Bill: 2400.0
Test Case 4
Input:
 600
Output:
 Total Bill: 3780.0*/
package com.codegnan.fundamentals;

import java.util.Scanner;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int units=sc.nextInt();
		double total=(units<=100)?units*2:(units>101&&units<300)?units*4:units*6;
		double surcharge=0;
		if(units>500) {
			surcharge=total*0.05;
		}
		System.out.println(total+surcharge);
		sc.close();

	}

}
