package com.codegnan.fundamentals;

import java.util.Scanner;

public class PositiveNegativeNumberCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String res=(num>0)?"Positive Number":(num<0)?"Negative Number":"Zero";
		System.out.println(res);
		sc.close();
		

	}

}
