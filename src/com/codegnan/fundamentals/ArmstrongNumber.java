package com.codegnan.fundamentals;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int number1=number;
		int originalnumber=number;
		int reverse=0;
		int count=0;
		while(number>0) {
			number=number/10;
			count++;
		}
		while(number1>0) {
			int lastdigit=number1%10;
			reverse+=Math.pow(lastdigit,count);
			number1/=10;
		}
		if(originalnumber==reverse) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}
		sc.close();

	}

}
