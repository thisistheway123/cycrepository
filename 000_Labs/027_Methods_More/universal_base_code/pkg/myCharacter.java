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
	
	public int setStrength(int strength) {
        this.strength = Math.max(strength, 0);
        return this.strength;
    }

    public int setDexterity(int dexterity) {
        this.dexterity = Math.max(dexterity, 0);
        return this.dexterity;
    }

    public int setIntelligence(int intelligence) {
        this.intelligence = Math.max(intelligence, 0);
        return this.intelligence;
    }

    public int setCharisma(int charisma) {
        this.charisma = Math.max(charisma, 0);
        return this.charisma;
    }
	
	public boolean setAll(String role, int strength, int dexterity, int intelligence, int charisma) {
        setRole(role);
        setStrength(strength);
        setDexterity(dexterity);
        setIntelligence(intelligence);
        setCharisma(charisma);
        return true;
    }
	public void myToString(String newRole){
		myCharacter r = new myCharacter();
		System.out.println("Your role is "+ newRole);
		System.out.println("Your strength trait is "+strength);
		System.out.println("Your dexterity trait is "+dexterity);
		System.out.println("Your intelligence trait is "+intelligence);
		System.out.println("Your charisma trait is "+charisma);
	}
	public String setRole(String x){
		System.out.println("------------------------------------------------");
		if(x.equalsIgnoreCase("Warrior")){
			System.out.println("You chose the Warrior!");
			System.out.println("How sigma!");
			this.role = "warrior";
		}
		else if(x.equalsIgnoreCase("Wizard")){
			System.out.println("You chose the Wizard!");
			System.out.println("How bombastic!");
			this.role = "wizard";
			
		}
		else if(x.equalsIgnoreCase("Rogue")){
			System.out.println("You chose the Rogue!");
			System.out.println("How skibidi!");
			this.role = "rogue";
		}
		else{
			System.out.println("Restart you dumb sus");
			this.role = "no role";
		}
		return this.role;
	}

}

