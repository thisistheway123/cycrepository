/*
 *	Author:  
 *  Date: 
*/
package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Character chosen = new Character();
		
		System.out.println("What class will you choose?");
		System.out.print("Warrior, Rogue, or Wizard: ");
		System.out.println(chosen.role);
		System.out.println("You have "+chosen.strength+" points of strength.");
		System.out.println("You have "+chosen.smartness+" points of intelligence.");
		System.out.println("You have "+chosen.charisma+" points of charisma.");
		System.out.println("You have "+chosen.rizz+" points of sigma.");
	}
}
class Character {
	String role = new String("Warrior");
	int strength = 5;
	int smartness = 5;
	int charisma = 5;
	int rizz = 5;
}
