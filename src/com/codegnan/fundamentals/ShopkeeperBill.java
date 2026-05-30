package com.codegnan.fundamentals;
import java.util.Scanner;
public class ShopkeeperBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int price=sc.nextInt();
		int discount=sc.nextInt();
		int Surcharge=sc.nextInt();
		int Budget=sc.nextInt();
		int finalcost=price-discount;
		finalcost+=Surcharge;
		boolean isOK=(finalcost>0)&&(finalcost<=Budget);
		System.out.println(finalcost);
		System.out.println(isOK);
		

	}

}
