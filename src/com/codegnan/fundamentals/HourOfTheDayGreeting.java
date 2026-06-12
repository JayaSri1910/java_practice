package com.codegnan.fundamentals;

import java.util.Scanner;

public class HourOfTheDayGreeting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hour:");
		int hour=sc.nextInt();
		String greeting=(hour>=5 && hour<12)?"Good Morning":
			(hour>=12 && hour<17)?"Good Afternoon":
			(hour>=17 && hour<22)?"Good Evening":"Good Night";
		System.out.println(greeting);
				
		sc.close();
		

	}

}
