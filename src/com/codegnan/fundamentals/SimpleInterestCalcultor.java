package com.codegnan.fundamentals;
import java.util.Scanner;
public class SimpleInterestCalcultor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principal Amount:");
		double principal=sc.nextDouble();
		System.out.println("Enter  time:");
		double time=sc.nextDouble();
		System.out.println("Enter rate of interest:");
		double rate=sc.nextDouble();
		double si=(principal*time*rate)/100;
		double total=si+principal;
		System.out.println("Simple Interest:"+si);
		System.out.println("Total Amount:"+total);
		

	}

}
