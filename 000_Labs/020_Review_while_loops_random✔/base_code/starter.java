/*
 *	Author:  Lucas Czachor
 *  Date: 27/9/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rnum = (int)(Math.random()*1000);
		System.out.print("Guess a random number 1-1000: ");
		int gnum = sc.nextInt();
		while(gnum!=rnum){
			if(gnum>rnum){
				System.out.println("Too high.");
			}
			if(gnum<rnum){
				System.out.println("Too low.");
			}
			System.out.println("Guess a random number 1-1000: ");
			gnum = sc.nextInt();
			if(gnum==rnum){
				System.out.print("You got it! The number was "+rnum+".");
			}
		}



		
	}
}
