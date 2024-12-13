/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;
	public int strength;
	public int dexterity;
	public int intelligence;
	public int charisma;

	public myCharacter(String r){
		role = r;
		intelligence = 0;
		strength = 0;
		dexterity = 0;
		charisma = 0;
	}
	
	public myCharacter(){
		role = "no role";
	}
	public void myToString(String newRole){
		myCharacter r = new myCharacter(role);
		System.out.println("Your role is "+ newRole);
		System.out.println("Your strength trait is 0");
		System.out.println("Your dexterity trait is 0");
		System.out.println("Your intelligence trait is 0");
		System.out.println("Your charisma trait is 0");
	}

}

