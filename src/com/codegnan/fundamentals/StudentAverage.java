package com.codegnan.fundamentals;
import java.util.Scanner;
public class StudentAverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a marks:");
		int a=sc.nextInt();
		System.out.println("Enter b marks:");
		int b=sc.nextInt();
		System.out.println("Enter c marks:");
		int c=sc.nextInt();
		double Avg=(a+b+c)/3;
        System.out.println("Average is:"+Avg);
        sc.close();
	}

}
