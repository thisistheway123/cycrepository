/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        greeting("Matthew");
        greeting("Amberdingus");
        greeting("Taqqurias#");
        
        double newSalary = raise(6000, 6);
        newSalary = raise(newSalary+6000, 6);
        newSalary = raise(newSalary+6000, 6);
        newSalary = raise(newSalary+6000, 6);
        newSalary = raise(newSalary+6000, 6);
        newSalary = raise(newSalary+6000, 6);
        newSalary = raise(newSalary+6000, 6);
        newSalary = raise(newSalary+6000, 6);
        newSalary = raise(newSalary+6000, 6);
        newSalary = raise(newSalary+6000, 6);
        System.out.println(newSalary);
        
    }
    
    private static double raise(double salary, int percent){
        double amount = salary + (salary * (percent/100.0));
        return amount;
    }
    
    public static void greeting(String name){
        System.out.println("Howdy " + name);
    }
    
    public static void printAnimal(){
        System.out.println("      .   ");
        System.out.println("\\_____)\\_____");
        System.out.println("/--v____ __`<");
        System.out.println("        )/ ");
    }
    
    
    
}