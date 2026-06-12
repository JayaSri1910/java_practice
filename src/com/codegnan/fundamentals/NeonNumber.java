package com.codegnan.fundamentals;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		int res=0;
		res=n*n;
		while(res!=0) {
			int lastdigit=res%10;
			sum+=lastdigit;
			res/=10;
			}
		if(sum==n) {
			System.out.println("Neon Number");
		}
		sc.close();

	}

}
