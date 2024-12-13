/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String e){
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence!");
		e = sc.nextLine();
	}
	public static void toStringCombined(String f,String e){
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence!");
		e = sc.nextLine();
		System.out.println("Write a sentence!");
		f = sc.nextLine();
		System.out.println("This is using the methods!");
		System.out.println(e);
		System.out.println(e+" "+f);
	}
	public static void main(String args[]) {
		toStringCombined("a","b");
	}
}
