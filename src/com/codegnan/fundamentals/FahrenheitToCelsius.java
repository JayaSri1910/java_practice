package com.codegnan.fundamentals;
import java.util.Scanner;
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit:");
		double fahrenheit=sc.nextDouble();
		double celsius=((fahrenheit-32)*5.0/9);
		System.out.println("Celsius is:"+(int)celsius);
		sc.close();
	}

}
