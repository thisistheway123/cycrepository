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
		System.out.println("Enter your word:");
		String wrd = sc.nextLine();
		int j = 0;
		for(int i = 0; i < wrd.length();i++){
			System.out.println(j +" "+ wrd.substring(i,i+1));
			j++;
		}
	}
}
