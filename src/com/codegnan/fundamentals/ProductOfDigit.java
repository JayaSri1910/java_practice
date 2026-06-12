package com.codegnan.fundamentals;

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		while(n>9) {
			int product=1;
		
		while(n>0) {
			int digit=n%10;
			 product=product*digit;
			n/=10;
			}
		n=product;
		System.out.println(n);
		sc.close();
		}
	}

}
