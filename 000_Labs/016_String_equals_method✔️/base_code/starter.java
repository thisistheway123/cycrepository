/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the class you wish to be(Warrior, Wizard, or Rogue?: ");
		String role = sc.nextLine();
		if(role.equals("Warrior")){
			System.out.println("So you've chosen Warrior. Good luck.");
		}
		else if(role.equals("Wizard")){
			System.out.println("So you've chosen Wizard. Good luck.");
		}
		else if(role.equals("Rogue")){
			System.out.println("So you've chosen Rogue. Good luck.");
		}
		else{
			System.out.print("Make sure to capitalize the class name and check for any typos.");
		}
	}
}
