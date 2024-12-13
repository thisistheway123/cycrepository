/*
    Lecture note example - If Statements
    Poole Lecture
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner(System.in);
        System.out.println("You’re a student getting ready for school and need to make a few important choices. First up: what will you do to prepare for your day?");
	    System.out.println("1. Put on your back pack");
        System.out.println("2. Choose your outfit");
        System.out.println("3. Eat a healthy breakfast");
        
        int answer1 = sc.nextInt(); // 1, 2, or 3
        
        if(answer1 == 1){
            System.out.println("You put on your backpack!");
            System.out.println("Next, would  you grab your:");
            System.out.println("1. Keys");
            System.out.println("2. Wallet");
            System.out.println("3. Phone");
            int answer2 = sc.nextInt();
            if(answer2 == 1)        
                System.out.println("You grab your Keys");
            else if(answer2 == 2)   
                System.out.println("You grab your Wallet");
            else if(answer2 == 3)   
                System.out.println("You grab your Phone");
            else                    
                System.out.println("You leave everything behind");
            
        }
        else if(answer1 == 2){
            System.out.println("You choose some good drip to wear.");
        }
        else if(answer1 == 3){
            System.out.println("You eat some cereal and a banana.");
        }
        else{
            System.out.println("You didn't type a correct answer!");
        }
    }
}