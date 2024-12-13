/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[(int)(50+Math.random()*149)];
		for(int i = 0; i < arr.length; i++){
			arr[i] = ((int)(Math.random()*100)+1);
		}
		int x = (int)(Math.random()*100);
		int min = Integer.MAX_VALUE;
		int max = 0;
		int average = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
			if(arr[i] > max){
				max = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++){
			average = average + arr[i];
		}
		System.out.println("Min is "+min);
		System.out.println("Max is "+max);
		System.out.println("Average is "+average/arr.length);
		System.out.println("Number of values are "+arr.length);
	}
}
