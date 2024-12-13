/*
 *	Author: Lucas Czachor
 *  Date: 10/2/24
 * 	Collaborator(s): no
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int dollars = 100;
		Scanner sc = new Scanner(System.in);
		System.out.println("----------SLOT-MACHINE----------");
		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("   d. Don't whine when you go broke.");
		System.out.println("By signing YOUR FIRST NAME here you consent to gambling all of your money away, potentially descending into debt: ");
		String name = sc.nextLine();
		if(name.equals("Lucas"))
			System.out.println("You have the best name in all of history, btw");
		while(dollars>0){
			System.out.print("Would you like to play the slots, "+name+"? (Yes/yes/Y/y): ");
			String yesorno = sc.nextLine();
			if(yesorno.equals("Yes")||yesorno.equals("yes")||yesorno.equals("Y")||yesorno.equals("y")){
				System.out.println("You have "+dollars+" dollars to wager.");
				System.out.println("You can wager 1-"+dollars+" dollars to the slots.");
				System.out.print("How much will you bet? ");
				int wager = sc.nextInt();
				sc.nextLine();
				if(wager>dollars){
					System.out.println("Don't cheat you monke. 😠");
				}
				if(wager<=0){
					System.out.println("Broke ahh");
				}
				if(wager<=dollars&&wager>0){
					System.out.println("You have wagered $"+wager+". Good luck!");
					int random1 = (int)(Math.random()*10+1);
					int random2 = (int)(Math.random()*10+1);
					int random3 = (int)(Math.random()*10+1);
					System.out.println("Alright lock in");
					System.out.println("The slots grant you: ");
						System.out.println("------------------------");
					System.out.println("| "+random1+" | "+random2+" | "+random3+" |");
					System.out.println("------------------------");
					if(random1==random2&&random2==random3){
						System.out.println("JACKPOT!! You have TRIPLED your money! Congrats!");
						dollars += wager * 2;
						System.out.println("You now have $"+dollars+".");
					}
					else if(random1==random2||random2==random3||random1==random3){
						System.out.println("You have DOUBLED your money! Congrats!");
						dollars += wager;
						System.out.println("You now have $"+dollars+".");
					}
					else{
						System.out.println("You got nothing. Womp womp. There goes your money.");
						dollars = dollars - wager;
						System.out.println("You now have $"+dollars+".");
					}
					
					
				}
				
			}
			else if(yesorno.equals("No")||yesorno.equals("no")||yesorno.equals("N")||yesorno.equals("n")){
				System.out.println("99% quit before their big win. Come back soon. Plus, you still had $"+dollars+" left. So imma keep that, "+name+".");
				break;
			}
			else{
				System.out.println("Bro you can't even type right lmao");
			}
		
		}
	}
}