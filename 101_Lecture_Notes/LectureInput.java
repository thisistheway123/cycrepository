/* 
    Lecture note example - Input and Scanner
    
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hi, "+name+"!");
        System.out.println("Input two of your favorite integers.");
        System.out.print("Integer 1: ");
        int numerouno = sc.nextInt();
        sc.nextLine();
        System.out.print("Integer 2: ");
        int numerodos = sc.nextInt();
        sc.nextLine();
        System.out.println("Your favorite integers are "+numerouno+" and "+numerodos+"!");
        int numerotres = numerouno + numerodos;
        System.out.println("The sum of these numbers is "+numerotres+".");
        System.out.print("Now input your favorite food: ");
        String comida = sc.nextLine();
        System.out.println("Your favorite food is "+comida+"!");
	}
}