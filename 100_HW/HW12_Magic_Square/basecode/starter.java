import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many perfect squares do you wish to see?");
		int num = sc.nextInt();
		CVMath.specialSquare(num);
	}
}
