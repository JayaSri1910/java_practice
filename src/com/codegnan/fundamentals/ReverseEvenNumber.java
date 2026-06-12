package com.codegnan.fundamentals;

import java.util.Scanner;

public class ReverseEvenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n;
		int evenrev=0;
		while(temp!=0) {
			int digit=temp%10;
			if(digit%2==0) {
				evenrev=evenrev*10+digit;
			}
			temp/=10;
		}
		temp=n;
		int res=0;
		int place=1;
		while(temp>0) {
			int digit=temp%10;
			if(digit%2==0) {
				res+=evenrev%10*place;
				evenrev/=10;
			}
			else {
				res+=digit*place;
			}
			place*=10;
			temp/=10;
		}
		System.out.println(res);
		sc.close();

	}

}
