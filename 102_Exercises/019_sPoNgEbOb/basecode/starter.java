/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a phrase to be cHaNgEd:");
		String words = sc.nextLine();
		String word = "";
		for(int i = 0; i < words.length();i++){
			String letter = words.substring(i,i+1);
			if(i%2==0){
				letter = letter.toLowerCase();
				word = word + letter;
			}
			if(i%2!=0){
				letter = letter.toUpperCase();
				word = word + letter;
			}
		}
		System.out.println(word);
	}
}
