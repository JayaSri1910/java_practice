package com.codegnan.fundamentals;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();//1234
		int reversedNumber=0;
		int originalnumber=number;
		number=Math.abs(number);
		while(number>0) {   //1234>0//123>0//12>0//1>0
			int lastdigit=number%10; //1234%10=4//123%10=3//12%10=2//1%10=1
			reversedNumber=reversedNumber*10+lastdigit;//0*10+4=4//4*10+3=43//43*10+2=432//432*10+1=4321
			number/=10; //1234/10=123//123/10=12//12/10=1//1/10=0.1
		}
		System.out.println("Reverse of number in a given number: " +originalnumber+ " is :" +reversedNumber);
		sc.close();

	}

}
