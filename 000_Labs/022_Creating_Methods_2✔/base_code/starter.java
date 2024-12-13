/*
 *	Author:  Lucas Czachor
 *  Date: 10/9/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("base number: ");
		int x = sc.nextInt();
		System.out.println("exponent: ");
		int y = sc.nextInt();
		int product = pow(x,y);
		System.out.println("The final number is "+product);
		
	}
	public static int pow(int x, int y){
		int count = 0;
		int amount = 1;
		while(count < y){
			amount = amount * x;
			count++;
		}
		return amount;
	}
}
