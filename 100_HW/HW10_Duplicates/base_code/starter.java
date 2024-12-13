/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[20];
		int x = (int)(1+(Math.random()*10));
		int dupes = 0;
		int place = 0;
		System.out.println("These are the 20 numbers:");
		System.out.println("----------------------------------------");
		for(int i = 0;i < arr.length;i++){
			arr[i] = (int)(1+(Math.random()*10));
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i = 0;i < arr.length;i++){
			if(arr[i] == x){
				System.out.println("The duplicate was found at position: "+i);
				dupes++;
			}
		}
		System.out.print("The random number to look for is: ");
		System.out.println(x);
		System.out.print("The number of duplicates: ");
		System.out.println(dupes);
		System.out.println("----------------------------------------");
		System.out.println("Looking for two in a row: ");
		for(int i = 0; i<19;i++){
			if(arr[i] == arr[i+1]+1||arr[i] == arr[i+1]){
				System.out.println("Two in a row found at indexes "+i+" and "+(i+1)+". The number is "+arr[i]);
			}
		}
	}
}
