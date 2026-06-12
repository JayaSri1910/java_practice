package com.codegnan.fundamentals;

import java.util.Scanner;

public class TaxBracket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double income=sc.nextDouble();
		String res=(income<3000000)?income*0.05:(income<3000000 && income>1000000)?income*0.10:()
		sc.close();

	}

}
