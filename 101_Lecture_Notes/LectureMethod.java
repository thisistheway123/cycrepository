/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        greeting("Lucas");
        greeting("The");
        greeting("Goat");
        double newSalary = raise(102312.2,5);
        System.out.println(newSalary);
        newSalary = raise(newSalary,10);
        System.out.println(newSalary);
	}
	
	public static double raise(double salary, int percent){
	    double amount = salary + (salary * (percent/100.0));
	    return amount;
	}
	public static void greeting(String name){
	    System.out.println("hola " + name);
	}
	public static void printAnimal(){
	    System.out.println("     w  c(..)o   (");
	    System.out.println("      \\__(-)    __)");
	    System.out.println("          /\\   (");
	    System.out.println("         /(_)___)");
	    System.out.println("         w /|");
	    System.out.println("          | \\");
	    System.out.println("         m  m");
	}
}