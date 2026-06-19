
/*6. Bill Amount with Discount
Question:
An online shopping platform offers a 10% discount on purchases above ₹1000.
Write a Java program that calculates the final bill amount after applying the discount using the ternary operator.
Test Case 1
Input:
 1200
Output:
 1080.0
Test Case 2
Input:
 800
Output:
 800.0*/
 package com.codegnan.fundamentals;

import java.util.Scanner;

public class BillAmountWithDiscount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		double discount=(amount>1000)?amount*0.10:0;
		double total=amount -discount;
		System.out.println(amount);
		System.out.println(total);
		sc.close();

	}

}
