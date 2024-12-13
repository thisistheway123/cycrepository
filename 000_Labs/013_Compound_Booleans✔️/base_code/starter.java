/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1 < num2 && num1 < num3){
			System.out.println("Smallest num1");
		}
		if(num2 < num1 && num2 < num3){
			System.out.println("Smallest num2");
		}
		if(num3 < num1 && num3 < num2){
			System.out.println("Smallest num3");
		}
		if(num1 > num2 && num1 > num3){
			System.out.println("Largest num1");
		}
		if(num2 > num1 && num2 > num3){
			System.out.println("Largest num2");
		}
		if(num3 > num2 && num3 > num1){
			System.out.println("Largest num3");
		}
	}
}
