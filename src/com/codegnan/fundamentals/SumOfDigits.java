package com.codegnan.fundamentals;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();//123
		int originalnumber = number;
		int sum = 0;
		while (number != 0) { //123!=0//12!=0//1!=0
			int lastdigit = number % 10; //123%10=3//12%10=2//1%10=1
			sum += lastdigit;//-->0+3=3//3+2=5//5+1=6
			number /= 10;//123/10=12//12/10=1//1/10=0.1
		}
		System.out.println("Sum of digits of the given number : " + originalnumber + " is : " + sum);
		sc.close();

	}

}
