/*
 *	Author:  Lucas Czachor
 *  Date: 9/18/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean z = x == y;
		if(z == true){
			System.out.println("E");
		}
		else if(z == false){
			System.out.println("F");
		}
		
	}
}
