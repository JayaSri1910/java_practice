package com.codegnan.fundamentals;

import java.util.Scanner;

public class BankAccountStatusCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount:");
		double balance=sc.nextInt();
		
		if(balance>=1000) {
			System.out.println("Good Standing");
		}
		else {
			if(balance>500 && balance<999) {
				System.out.println("Low Balance");
			}
			else {
				System.out.println("Account overdrawn");
			}
		}
		sc.close();
		
	}

}
