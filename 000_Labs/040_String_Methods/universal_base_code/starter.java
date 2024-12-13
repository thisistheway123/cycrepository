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
		System.out.println("What's your first and last name?");
		String name = sc.nextLine();
		int space1 = name.indexOf(" ");
		System.out.print("Your last name is ");
		System.out.println(name.substring(space1+1));
	}
}
