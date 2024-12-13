/*
 *	Author: Lucas Czachor
 *  Date: 10/13/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Gimme a number: ");
		int num1 = sc.nextInt();
		printPrimes(num1);
	}
	public static boolean checkPrime(int num){
		if(num<=1){
			return false;
		}
		int num2 = 2;
		while(num2 * num2 <= num){
			if(num%num2==0){
				return false;
			}
			num2++;
		}
		return true;
	}
	public static void printPrimes(int x){
		int y = 2;
	 	while(y<x){
			if(checkPrime(y)==true){
				System.out.println(y+" is a prime number.");
			}
			y++;
		}
	}
}
