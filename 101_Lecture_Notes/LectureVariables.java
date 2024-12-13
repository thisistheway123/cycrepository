/* 
    Lecture note example - Variables (String, int, double)
    
*/
import java.util.Scanner;
class LectureVariables{
    public static void main(String args[]) {Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for primes less than it: ");
        int inputNum = scanner.nextInt();

        printPrimes(inputNum); // Call the method to print primes
	}
	
	public static void printPrimes(int maxNum) {
        int currentNum = 2; // Start checking from 2
        while (currentNum < maxNum) {
            if (checkPrime(currentNum)) { // Call checkPrime method
                System.out.println(currentNum + " is a prime number.");
           }
           currentNum++;
        }
    }
    public static boolean checkPrime(int num) {
        // Handle edge cases
        if (num <= 1) {
            return false; // Numbers less than 2 are not prime
        }

        int divisor = 2;
        while (divisor * divisor <= num) { // Check up to the square root of num
            if (num % divisor == 0) {
                return false; // Found a divisor, so num is not prime
            }
            divisor++;
        }

        return true; // No divisors found, num is prime
    }

}