package com.codegnan.fundamentals;
import java.util.Scanner;
public class DairyCompanyCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double initialmilkratio=sc.nextDouble();
		double initialwaterratio=sc.nextDouble();
		double mixture=sc.nextDouble();
		double finalmilkratio=sc.nextDouble();
		double finalwaterratio=sc.nextInt();
		double initialmilkfraction=(double)initialmilkratio/(initialwaterratio+initialmilkratio);
		double finalmilkfraction=(double)finalmilkratio/(finalwaterratio+finalmilkratio);
		double capacity=(initialmilkfraction * mixture)/(initialmilkfraction-finalmilkfraction);
		System.out.println("Container capacity:"+(int)capacity+"litres");

	}

}
