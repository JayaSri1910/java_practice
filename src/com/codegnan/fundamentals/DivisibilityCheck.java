package com.codegnan.fundamentals;

import java.util.Scanner;

public class DivisibilityCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(num%3==0 && num%5==0) {
			System.out.println("Dvisible by 3 and 5");
		}
		else {
			System.out.println("Not Divisible by 3 and 5");
		}
		sc.close();
		

	}

}
