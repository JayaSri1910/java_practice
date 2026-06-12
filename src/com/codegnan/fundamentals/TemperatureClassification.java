package com.codegnan.fundamentals;

import java.util.Scanner;

public class TemperatureClassification {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temperature:");
		int temp=sc.nextInt();
		String res=(temp>30)?"Hot":(temp>15 && temp<30)?"Moderate":"Cold";
		System.out.println(res);
		sc.close();
		
		

	}

}
