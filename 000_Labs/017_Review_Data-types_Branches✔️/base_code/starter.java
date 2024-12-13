/*
 *	Author:  Lucas Czachor
 *  Date: 25/9/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int statpoints = 20;
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter your title(Big Strong Man): ");
		String title = sc.nextLine();
		System.out.println("Enter the class you wish to be(Warrior, Wizard, or Rogue?: ");
		String role = sc.nextLine();
		//===============================================================//
		if(role.equals("Warrior")){
			System.out.println("So you've chosen Warrior. Good luck.");
			
		}
		//===============================================================//
		else if(role.equals("Wizard")){
			System.out.println("So you've chosen Wizard. Good luck.");
		}
		//===============================================================//
		else if(role.equals("Rogue")){
			System.out.println("So you've chosen Rogue. Good luck.");
		}
		//===============================================================//
		else
			System.out.println("Erm... Okay you spelled that wrong so you're just not getting one.");
			
		//===============================================================//
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Sigma. Spend them wisely.");
		System.out.print("Strength (1-10): ");
		int strpointminus = sc.nextInt();
		if(strpointminus <= 10 || strpointminus >= 1){
			if(statpoints <= 0){
				System.out.print("Choose a bigger amount: ");
				strpointminus = sc.nextInt();
			}
			if(statpoints > 10){
				System.out.print("Choose a smaller amount: ");
				strpointminus = sc.nextInt();
			}
		}
		else if(strpointminus > 10 || strpointminus < 1){
			System.out.println("You inputted the wrong value >:(");
			strpointminus = sc.nextInt();
		}
		statpoints = statpoints - strpointminus;
		System.out.println("You have "+statpoints+" left to spend.");
		//===============================================================//
		System.out.print("Dexterity (1-10): ");
		int dexpointminus = sc.nextInt();
		if(dexpointminus <= 10 || dexpointminus >= 1){
			if(statpoints <= 0){
				System.out.print("Choose a smaller amount: ");
				dexpointminus = sc.nextInt();
			}
			if(statpoints > 10){
				System.out.print("Choose a smaller amount: ");
				dexpointminus = sc.nextInt();
			}
		}
		else if(dexpointminus > 10 || dexpointminus < 1){
			System.out.println("You inputted the wrong value >:(");
			dexpointminus = sc.nextInt();
		}
		statpoints = statpoints - dexpointminus;
		System.out.println("You have "+statpoints+" left to spend.");
		//===============================================================//
		System.out.print("Intelligence (1-10): ");
		int intpointminus = sc.nextInt();
		if(intpointminus <= 10 || intpointminus >= 1){
			if(statpoints <= 0){
				System.out.print("Choose a smaller amount: ");
				intpointminus = sc.nextInt();
			}
			if(statpoints => 10){
				System.out.print("Choose a smaller amount: ");
				intpointminus = sc.nextInt();
			}
		}
		else if(intpointminus > 10 || intpointminus < 1){
			System.out.println("You inputted the wrong value >:(");
			intpointminus = sc.nextInt();
		}
		statpoints = statpoints - intpointminus;
		System.out.println("You have "+statpoints+" left to spend.");
		//===============================================================//
		System.out.print("Sigma (1-10): ");
		int sigpointminus = sc.nextInt();
		if(sigpointminus <= 10 || sigpointminus >= 1){
			if(statpoints <= 0){
				System.out.print("Choose a smaller amount: ");
				sigpointminus = sc.nextInt();
			}
			if(statpoints > 10){
				System.out.print("Choose a smaller amount: ");
				sigpointminus = sc.nextInt();
			}
		}
		else if(sigpointminus > 10 || sigpointminus < 1){
			System.out.println("You inputted the wrong value >:(");
			sigpointminus = sc.nextInt();
		}
		statpoints = statpoints - sigpointminus;
		System.out.println("You have "+statpoints+" left to spend.");
		//===============================================================//
		if(role.equals("Warrior")){
			System.out.println("---------------------------------------------");
			System.out.println("You are "+name+", the "+title+" of CVHS.");
			System.out.println("You're a "+role+" with the following stats:");
			System.out.println("Strength: "+strpointminus);
			System.out.println("Dexterity: "+dexpointminus);
			System.out.println("Intelligence: "+intpointminus);
			System.out.println("Sigma: "+sigpointminus);
			System.out.println("Good luck on your quest, "+name+".");
		}
		//===============================================================//
		else if(role.equals("Wizard")){
			System.out.println("---------------------------------------------");
			System.out.println("You are "+name+", the "+title+" of CVHS.");
			System.out.println("You're a "+role+" with the following stats:");
			System.out.println("Strength: "+strpointminus);
			System.out.println("Dexterity: "+dexpointminus);
			System.out.println("Intelligence: "+intpointminus);
			System.out.println("Sigma: "+sigpointminus);
			System.out.println("Good luck on your quest, "+name+".");
		}
		//===============================================================//
		else if(role.equals("Rogue")){
			System.out.println("---------------------------------------------");
			System.out.println("You are "+name+", the "+title+" of CVHS.");
			System.out.println("You're a "+role+" with the following stats:");
			System.out.println("Strength: "+strpointminus);
			System.out.println("Dexterity: "+dexpointminus);
			System.out.println("Intelligence: "+intpointminus);
			System.out.println("Sigma: "+sigpointminus);
			System.out.println("Good luck on your quest, "+name+".");
		}
		//===============================================================//
		else{
			System.out.println("---------------------------------------------");
			System.out.println("You are "+name+", the "+title+" of CVHS.");
			System.out.println("You're a dumbo who can't spell the class right with the following stats:");
			System.out.println("Strength: "+strpointminus);
			System.out.println("Dexterity: "+dexpointminus);
			System.out.println("Intelligence: "+intpointminus);
			System.out.println("Sigma: "+sigpointminus);
			System.out.println("Good luck on your quest, "+name+".");
		}
	}
}
