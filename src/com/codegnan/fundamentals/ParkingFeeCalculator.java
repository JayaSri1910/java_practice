/*Parking Fee Calculator
Question:
A smart parking management system is used in a busy shopping mall to automatically calculate parking charges based on the type of vehicle and duration of parking.
The parking fee is calculated using the following rules:
Vehicle Charges:
• Car: ₹50 per hour
• Bike: ₹30 per hour
• Truck: ₹100 per hour
Discount:
• If a vehicle is parked for more than 5 hours, a 20% discount is applied to the total parking fee.
Night-Time Surcharge:
• If the vehicle is parked during night hours (between 6 PM and 8 AM), a 50% surcharge is applied to the total fee after the discount.
The system should also handle cases where the parking duration crosses midnight.
Write a Java program that accepts the vehicle type, arrival time, and departure time and calculates the final parking fee.
Input Format:
The first line contains a string representing the vehicle type (Car, Bike, or Truck).
The second line contains an integer representing the arrival time in 24-hour format.
The third line contains an integer representing the departure time in 24-hour format.
Output Format:
Display the total parking fee after applying the discount and surcharge (if applicable).
Constraints:
• Arrival and departure times are in 24-hour format.
• If the departure time is less than the arrival time, assume the parking duration crossed midnight.
• Apply a 20% discount for parking durations greater than 5 hours.
• Apply a 50% surcharge for vehicles parked during night hours (6 PM to 8 AM).

Sample Test Case 1
Input:
 car
 14
 20
Output:
 Total parking fee: ₹360.0
Explanation:
Parking Duration = 6 hours
Base Fee = 6 × 50 = ₹300
20% Discount = ₹60
Fee after Discount = ₹240
Night Surcharge = 50% of ₹240 = ₹120
Final Fee = ₹360.0

Sample Test Case 2
Input:
 bike
 10
 14
Output:
 Total parking fee: ₹120.0
Explanation:
Parking Duration = 4 hours
Base Fee = 4 × 30 = ₹120
No Discount
No Night Surcharge
Final Fee = ₹120.0

Sample Test Case 3
Input:
 truck
 22
 4
Output:
 Total parking fee: ₹720.0
Explanation:
Parking Duration = 6 hours
Base Fee = 6 × 100 = ₹600
20% Discount = ₹120
Fee after Discount = ₹480
Night Surcharge = ₹240
Final Fee = ₹720.0

Sample Test Case 4
Input:
 car
 8
 16
Output:
 Total parking fee: ₹320.0
Explanation:
Parking Duration = 8 hours
Base Fee = 8 × 50 = ₹400
20% Discount = ₹80
Fee after Discount = ₹320
No Night Surcharge
Final Fee = ₹320.0

Sample Test Case 5
Input:
 bike
 19
 23
Output:
 Total parking fee: ₹180.0
Explanation:
Parking Duration = 4 hours
Base Fee = 4 × 30 = ₹120
No Discount
Night Surcharge = ₹60
Final Fee = ₹180.0*/
package com.codegnan.fundamentals;

import java.util.Scanner;

public class ParkingFeeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String type=sc.next();
		int arrivaltime=sc.nextInt();
		int departuretime=sc.nextInt();
		int duration;
		if(departuretime>=arrivaltime) {
			duration=departuretime-arrivaltime;
		}else {
			duration=(24-arrivaltime)+departuretime;
		}
		int rate=0;
		if(type.equals("car")) {
			rate=50;
		}else {
			if(type.equals("bike")) {
				rate=30;
			}
			else {
				rate=100;
			}
		}
		int cost=duration*rate;
		int discount=0;
		if(duration>5) {
			discount=(int)(cost*0.20);
		}
		cost=cost-discount;
		int surcharge=0;
		if(arrivaltime>=18 || arrivaltime<8 || departuretime>=18 || departuretime<8) {
			surcharge=(int)(cost*0.50);
		}
		double total=cost+surcharge;
		System.out.println(total);
		
		sc.close();
	}

}
