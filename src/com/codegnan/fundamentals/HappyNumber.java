package com.codegnan.fundamentals;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");//19
		int number=sc.nextInt();
		while(number!=1 && number!=4) {//19!=1 && 19!=4
			int sum=0;
			while(number!=0) { //19!=0 //81!=0
			   int lastdigit=number%10; //19%10=9 //81%10=1
			   sum+=lastdigit*lastdigit;//9*9=81 //1*1=1
			   number/=10;       //9/10=0.1 //1/10=0.1
		   }
		   number=sum; //81 //1
		}
		   if(number==1) { //1==1
			   System.out.println("Happy Number");
		   }
		   else {
			   System.out.println("Not a Happy Number");
		   }
		
		
		sc.close();
}	

	}

