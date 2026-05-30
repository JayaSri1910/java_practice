package com.codegnan.fundamentals;
import java.util.Scanner;
public class PlayersScore {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int baseValue=sc.nextInt();
		int bonus=sc.nextInt();
		int total=baseValue;
		total+=bonus;
		total*=2;
		boolean result=(total>50)&&(bonus%2!=0);
		System.out.println(total);
		System.out.println(result);

	}

}
