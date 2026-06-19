/*Question:
A weather forecasting application provides alerts based on current weather conditions and temperature.
Condition Codes:
• 1 → Sunny
• 2 → Rainy
• 3 → Stormy
Special Rule:
• If the weather condition is Stormy and the temperature is below 10°C, display "Severe Warning".
• Otherwise, display the weather condition name.
If the user enters an invalid condition code, display "Invalid Condition".
Write a Java program using a switch statement to display the appropriate weather alert.
Input Format:
Two integers representing:
• Weather Condition Code
• Temperature in Celsius
Output Format:
Display the weather alert message.

Sample Test Case 1
Input:
 1 20
Output:
 Sunny

Sample Test Case 2
Input:
 2 25
Output:
 Rainy

Sample Test Case 3
Input:
 3 5
Output:
 Severe Warning

Sample Test Case 4
Input:
 7 30
Output:
 Invalid Condition
============================================================================================*/

package com.codegnan.fundamentals;

import java.util.Scanner;

public class WeatherAlertSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int weathercode=sc.nextInt();
		int temperature=sc.nextInt();
		switch(weathercode) {
		case 1:
			System.out.println("Sunny");
			break;
		case 2:
			System.out.println("Rainy");
			break;
		case 3:
			System.out.println("Severe Warning");
			break;
		default:
			System.out.println("Invalid Condition");
			break;
		}
		sc.close();
				

	}

}
