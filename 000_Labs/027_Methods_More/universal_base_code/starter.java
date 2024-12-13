/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		myCharacter x = new myCharacter();
		System.out.println("You got " + x.role+".");
		System.out.println("------------------------------------------------");
		System.out.println("What class will you go?");
		System.out.println("Warrior, Wizard, or Rogue?");
		String role = sc.nextLine();
		x.setRole(role);
		System.out.println("------------------------------------------------");
		x.myToString(role);
	}
}
