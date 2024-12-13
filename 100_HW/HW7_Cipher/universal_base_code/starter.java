/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you need to decode, keyed cipher, or input?");
		String yesorno = sc.nextLine();
		
		if(yesorno.equalsIgnoreCase("keyed")){
			System.out.println("Enter the statement you wish to decode:");
			String cipher = sc.nextLine();
			int count = 0;
			while(count < 36){																																																																																																																																																																																																															// SKIBIDI TOILET
				count++;
				String message = Cipher.keyedEncode(cipher,count);
				System.out.println("Your decrypted message is:");
				System.out.println(count + ". " + message + "    <<");
				System.out.println("Now check the number to see the key");
			}
		}
		
		else if(yesorno.equalsIgnoreCase("decode")){
			System.out.println("Enter the statement you wish to decode:");
			String cipher = sc.nextLine();
			String message = Cipher.encode(cipher);
			System.out.println("Your decrypted message is:");
			System.out.println(message);
		}
		
		else if(yesorno.equalsIgnoreCase("input")){
			System.out.println("Input the message you wish to encode:");
			String cipher = sc.nextLine();
			String message = Cipher.encode(cipher);
			System.out.println("Your encoded message is:");
			System.out.println(message);
		}
		
		else{
			System.out.println("You typed something wrong.");
		}
	}
}

