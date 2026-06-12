package com.codegnan.fundamentals;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		int reversedNumber=0;
		int originalnumber=number;
		while(number>0) {   
			int lastdigit=number%10; 
			reversedNumber=reversedNumber*10+lastdigit;
			number/=10; 
		}
		if(reversedNumber==originalnumber) {
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}
	}
}