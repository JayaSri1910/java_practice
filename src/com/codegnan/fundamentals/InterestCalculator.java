package com.codegnan.fundamentals;
import java.util.Scanner;
public class InterestCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal Amount:");
		int principal=sc.nextInt();
		System.out.println("Enter time in months:");
		int months=sc.nextInt();
		System.out.println("Enter rate of interest:");
		int rate=sc.nextInt();
		double years=months/12.0;
		double si=(principal*rate*years)/100;
		double amount=principal*Math.pow((1+rate/100.0),years);
		double ci=amount-principal;
		System.out.println("Simple Interest:"+si);
		System.out.println("Compound Interest:"+ci);
		
	}

}
