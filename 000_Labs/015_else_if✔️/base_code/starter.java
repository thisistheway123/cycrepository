/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hi. Guess my number 1-1000: ");
		int numero = sc.nextInt();
		int Rnumero = (int)(Math.random()*1000);
		if(numero >= 1 || numero <= 1000){
			if(numero == Rnumero){
				System.out.print("Wow! You actually got the right number!");
			}
			else if(numero != Rnumero){
				if(numero > Rnumero){
					System.out.print("Nope. Too big. The number was "+Rnumero+".");
				}
				if(numero < Rnumero){
					System.out.print("Nope. Too small. The number was "+Rnumero+".");
				}
			}
		}
		if(numero < 1 || numero > 1000){
			System.out.print(" Remember, 1-1000.");
		}
	}
}
