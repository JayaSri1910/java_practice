/*Question:
A company wants to automate its employee bonus calculation system. The bonus amount depends on the employee's role in the organization.
Bonus Structure:
• Role Code 1 (Manager) → 10% of salary as bonus
• Role Code 2 (Developer) → 5% of salary as bonus
• Role Code 3 (Intern) → ₹500 fixed bonus
If the user enters an invalid role code, display "Invalid Role".
Write a Java program using a switch statement to calculate and display the employee bonus amount.
Input Format:
Two integers representing:
• Role Code
• Salary
Output Format:
Display the bonus amount or "Invalid Role".

Sample Test Case 1
Input:
 1 50000
Output:
 5000

Sample Test Case 2
Input:
 2 40000
Output:
 2000

Sample Test Case 3
Input:
 3 30000
Output:
 500

Sample Test Case 4
Input:
 5 45000
Output:
 Invalid Role
---------------------------------------------------------------------------------------------*/

package com.codegnan.fundamentals;

import java.util.Scanner;

public class EmployeeBonusCalc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int role=sc.nextInt();
		int salary=sc.nextInt();
		int bonus;
		switch(role) {
		case 1:
			 bonus=(int)(salary*0.10);
			 System.out.println(bonus);
			 break;
		case 2:
			bonus=(int)(salary*0.05);
			System.out.println(bonus);
			break;
		case 3:
			bonus=500;
			System.out.println(bonus);
			break;
		default:
			System.out.println("Invalid Role");	
		}
		sc.close();

	}

}
