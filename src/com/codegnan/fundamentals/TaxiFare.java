package com.codegnan.fundamentals;

import java.util.Scanner;

public class TaxiFare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance travveled in kilometers:");
		double distance=sc.nextDouble();
		double fare=(distance<=2)?50:(distance<=10)?(50+(distance-2)*15):(50+(8*15)+(distance-10)*10);
		
		sc.close();

	}

}
