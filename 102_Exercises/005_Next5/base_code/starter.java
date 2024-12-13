/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one number:");
		int numba = sc.nextInt();
		System.out.println("Here are the next 5 numbers,");
		System.out.println((numba)+", "+(numba+1)+", "+(numba+2)+", "+(numba+3)+", "+(numba+4)+", "+(numba+5));
		System.out.println("Here are the next 5 multiples,");
		System.out.println((numba)+", "+(numba*2)+", "+(numba*3)+", "+(numba*4)+", "+(numba*5)+", "+(numba*6));
		System.out.println("Here is "+numba+" divided by 100.");
		double numba2 = numba/100.0;
		System.out.println(numba2);
		System.out.println("Here is "+numba+" divided by 10.");
		double numba3 = numba/10.0;
		System.out.println(numba3);
		


	}
}
