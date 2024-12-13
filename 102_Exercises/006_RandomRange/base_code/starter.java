/*
 *	Author: Lucas Czachor
 *  Date: 9/16/24
 *	Collaborator(s): just me lmao
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number:");
		System.out.print("Enter your first number: ");
		int numeroUno = sc.nextInt();
		System.out.print("Enter your next number(this must be bigger than the first): ");
		int numeroDos = sc.nextInt();
		System.out.println("Your range is "+numeroUno+" to "+numeroDos+".");
		System.out.println("Here are the 5 numbers generated in that range: ");
		int numeroTres = (int)(Math.random()*(numeroDos-numeroUno)+numeroUno);
		int numeroQuatro = (int)(Math.random()*(numeroDos-numeroUno)+numeroUno);
		int numeroCinco = (int)(Math.random()*(numeroDos-numeroUno)+numeroUno);
		int numeroSeis = (int)(Math.random()*(numeroDos-numeroUno)+numeroUno);
		int numeroSiete = (int)(Math.random()*(numeroDos-numeroUno)+numeroUno);
		System.out.print(numeroTres+", "+numeroQuatro+", "+numeroCinco+", "+numeroSeis+", "+numeroSiete+".");
	}
}
