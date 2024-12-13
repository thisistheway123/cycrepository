/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	public static void toStringArray(int[] x){
		for(int i = 0; i<x.length;i++){
			System.out.print(x[i]+" ");
		}
	}
	public static int getArrayAverage(int[] x){
		int average = 0;
		for(int i = 0;i<x.length;i++){
			average = average + x[i];
		}
		return average/x.length;
	}
}

