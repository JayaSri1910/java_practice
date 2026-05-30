package com.codegnan.fundamentals;
import java.util.Scanner;
public class OrderCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double price=sc.nextDouble();
		int quantity=sc.nextInt();
		double budget=sc.nextDouble();
		double basecost=price*quantity;
		double finalvalue=basecost+(basecost*0.10);
		boolean isValid=(finalvalue<=budget)&&(quantity>=1);
		System.out.println(finalvalue);
		System.out.println(isValid);

	}

}
