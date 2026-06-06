package com.codegnan.fundamentals;

import java.util.Scanner;

public class OneToNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int count=1;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count++);
				System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
