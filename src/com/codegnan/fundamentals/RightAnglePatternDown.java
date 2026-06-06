package com.codegnan.fundamentals;

import java.util.Scanner;

public class RightAnglePatternDown {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		for(int i=rows;i>=1;i++) {
			for(int j=rows;j>=i;j--) {
				System.out.println("*");
			}
			System.out.println( );
		}
		
		sc.close();
		}

}
