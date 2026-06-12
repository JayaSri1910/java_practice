package com.codegnan.fundamentals;

import java.util.Scanner;

public class GreatestOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number");
		int fn=sc.nextInt();
		System.out.println("Enter a second number");
		int sn=sc.nextInt();
		String res=(fn>sn)?"fn":"sn";
		System.out.println("Greatest number is:"+res);
		sc.close();

	}

}
