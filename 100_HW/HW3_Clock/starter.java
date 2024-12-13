/*
 *	Author: Lucas Czachor
 *  Date: 9/16/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter what day it is(0-6): ");
		int day = sc.nextInt();
		int monday = 1;
		int tuesday = 2;
		int wednesday = 3;
		int thursday = 4;
		int friday = 5;
		int saturday = 6;
		int sunday = 0;
		if(day == monday) {
			System.out.println("It's a weekday :((((. Time to wake up at 7:00AM.");
		}
		else if(day == tuesday) {
			System.out.println("It's a weekday :((((. Time to wake up at 7:00AM.");
		}
		else if(day == wednesday) {
			System.out.println("It's a weekday :((((. Time to wake up at 7:00AM.");
		}
		else if(day == thursday) {
			System.out.println("It's a weekday :((((. Time to wake up at 7:00AM.");
		}
		else if(day == friday) {
			System.out.println("It's a weekday :((((. Time to wake up at 7:00AM.");
		}
		else if(day == saturday) {
			System.out.println("It's a weekend! YAY! Time to wake up at 10:00AM.");
		}
		else if(day == sunday) {
			System.out.println("It's a weekend! YAY! Time to wake up at 10:00AM.");
		}
		else{
			System.out.println("Put the values stated and try again");
		}
}
}