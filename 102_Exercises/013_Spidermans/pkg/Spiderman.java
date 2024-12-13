package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	public String actor;		// What's the actors name?
	public int age;			// What's the age of the actor?
	public String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	public Spiderman(){
		actor = "unknown";
		age = 0;
		villain = "unknown";
	}
	public Spiderman(String a, int ag){
		actor = a;
		age = ag;
		villain = "unknown";
	}
	public Spiderman(int ag, String v){
		actor = "unknown";
		age = ag;
		villain = v;
	}
	public Spiderman(String a, int ag, String v){
		actor = a;
		age = ag;
		villain = v;
	}
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public void setAge(int age){
		this.age = age;
	}
	public void setActor(String actor){
		this.actor = actor;
	}
	public void setVillain(String villain){
		this.villain = villain;
	}
	public String getActor(){
		return this.actor;
	}
	public int getAge(){
		return this.age;
	}
	public String getVillain(){
		return this.villain;
	}
	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + this.villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
