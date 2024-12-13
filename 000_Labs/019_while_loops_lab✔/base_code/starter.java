/*
 *	Author:  Lucas Czachor
 *  Date: 27/9/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter the amount of times your name will be repeated: ");
		int times = sc.nextInt();
		while(count<=times){
			System.out.println(name);
			count = count + 1;
		}

	}
}
