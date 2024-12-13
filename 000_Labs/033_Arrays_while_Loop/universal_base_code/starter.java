/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[1000];
		int i = 0;
		while(i < 1000){
			arr[i] = (int)(Math.random()*1000);
			System.out.println(arr[i]);
			i++;
		}
	}
}
