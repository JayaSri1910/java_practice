package com.codegnan.fundamentals;
import java.util.Scanner;
public class CompoundInterest {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter principal Amount:");
	int principal=sc.nextInt();
	System.out.println("Enter time:");
	int time=sc.nextInt();
	System.out.println("Enter rate of interest:");
	int rate=sc.nextInt();
	double amount=principal*Math.pow((1+ rate/100.0),time);
	double CompoundInterest=amount-principal;
	System.out.println("Compound Interest:"+CompoundInterest);
	System.out.println("Total Amount:"+amount);

	}

}
