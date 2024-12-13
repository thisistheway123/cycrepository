import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the month you were born: ");
        String month = sc.nextLine();
        
        System.out.println("Enter the day you were born: ");
        int day = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the year you were born: ");
        int year = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the current price of a buck fifty: ");
        double price = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Your name is " + name + " and you are " + age + " years old. You were born on " + month + " " + day + ", " + year + ". A buck fifty currently is " + price + ".");
    }
}
