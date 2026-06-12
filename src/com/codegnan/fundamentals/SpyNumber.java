package com.codegnan.fundamentals;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		int product=1;
		while(n!=0) {
			int lastdigit=n%10;
			sum=sum+lastdigit;
			product=product*lastdigit;
			n/=10;
		}
		if(sum==product) {
			System.out.println("Spy Number");
		}
		else {
			System.out.println("Not a Spy Number");
		}
		sc.close();

	}

}
