package com.codegnan.fundamentals;

import java.util.Scanner;

public class DiscountCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double amount=sc.nextDouble();
		double discountAmount=(amount>=1000)?amount*0.2:(amount>500 && amount<999)?amount*0.1:amount*0.0;
		double totalAmount=amount-discountAmount;
		System.out.println("Total Amount is:"+totalAmount);
		sc.close();
		
		

	}

}
