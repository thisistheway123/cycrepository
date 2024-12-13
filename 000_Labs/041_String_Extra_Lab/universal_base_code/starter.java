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
		System.out.println("Enter a phrase:");
		String phrase = sc.nextLine();
		String words = "";
		while(true){
			if(phrase.indexOf(" ")==-1){
				words = phrase +" "+ words;
				break;
			}
			int space = phrase.indexOf(" ");
			String word = phrase.substring(0, space);
			words = word +" "+words;
			phrase = phrase.substring(space+1);
		}
		System.out.println(words);
	}
}
