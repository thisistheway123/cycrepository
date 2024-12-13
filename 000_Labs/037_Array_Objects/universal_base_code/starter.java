/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior[] Warriors = new Warrior[100];
		Wizard[] Wizards = new Wizard[100];
		for(int i = 0;i<100;i++){
			Warriors[i] = new Warrior();
			Wizards[i] = new Wizard();
		}
		int battlingWarI = 0;
		int battlingWizI = 0;
		while(Warriors.length > battlingWarI && Wizards.length > battlingWizI){ // this part literally took me 2 hours
			Warrior battlingWar = Warriors[battlingWarI];
			Wizard battlingWiz = Wizards[battlingWizI];
			if(battlingWiz.isDead()==false&&battlingWar.isDead()==false){
				battlingWiz.attack(battlingWar);
			}
			if(battlingWar.isDead()==true){
				battlingWarI++;
			}
			if(battlingWar.isDead()==false&&battlingWiz.isDead()==false){
				battlingWar.attack(battlingWiz);
			}
			if(battlingWiz.isDead()==true){
				battlingWizI++;
			}
			
		}
		if(battlingWarI >= 100){
			System.out.println("Wizards win! YAYAYA. They were left with "+(Wizards.length-battlingWizI)+" wizards alive...");
		}
		else{
			System.out.println("Warriors win! YAYAYA. They were left with "+(Warriors.length-battlingWarI)+" warriors alive...");
		}
		
	}
}
