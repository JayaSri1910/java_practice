package com.codegnan.fundamentals;

import java.util.Scanner;

public class GeometryApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		if(a==b && b==c && c==d && d==a) {
			System.out.println("Square");
		}else {
			if(a==c && b==d) {
				System.out.println("Rectangle");
			}else {
				System.out.println("other");
			}
		}
		sc.close();

	}

}
