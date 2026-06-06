package com.codegnan.fundamentals;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int count=1;
		for(int i=1;i<=rows;i++) {
			for(int j=rows-1;j>=i;j--) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(count++);
				System.out.print("  ");
			}
			System.out.println();
		}
		sc.close();

	}

}
