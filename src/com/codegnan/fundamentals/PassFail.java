package com.codegnan.fundamentals;

import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks=sc.nextInt();
		if(marks>35) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		sc.close();
		

	}

}
