/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------THE ULTIMATE PIG LATIN TRANSLATOR--------");
		System.out.println("Please enter a sentence to translate:");
		String words = sc.nextLine();
        while(true){
            if(words.indexOf(" ") == -1){
            	System.out.print(pigLatinify(words));
                break;
            }
            int space = words.indexOf(" ");
            String word = words.substring(0, space);
            System.out.print(pigLatinify(word) + " ");
            words = words.substring(space+1);
        }
        
	}
	public static String pigLatinify(String word){
		String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
		String vowels = "aeiouAEIOU";
		String fWord = "";
		String letter = word.substring(0,1);
	    String letter2 = "";
	    if(word.length() > 1){
	    	letter2 = word.substring(1,2);
	    }
		if(consonants.contains(letter)){
	    	if(consonants.contains(letter2)){
	    		String newWord = word.substring(2);
	 			fWord = newWord + "-" + letter + letter2 + "ay";
	    	}
	    	if(vowels.contains(letter2)){
	    		String newWord = word.substring(1);
	    		fWord = newWord + "-" + letter + "ay";
	    	}
	   	}
	    if(vowels.contains(letter)){
	       	fWord = word + "-way";
	   	}
		return fWord;
	}
}
