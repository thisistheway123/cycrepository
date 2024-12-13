/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Dog doggy = new Dog("Bob",123);
		Dog dogtwo = new Dog("Bobby", "Husky");
		boolean doggymimimi = doggy.isSleeping();
		if(doggymimimi)
			System.out.println(doggy.getName() + " is asleep");
		else{
			doggy.bark();
		}
		boolean doggytwomimimi = dogtwo.isSleeping();
		if(doggytwomimimi){
			if(!doggymimimi){
				dogtwo.bark();
			}
		}
		else{
			if(!doggymimimi){
				dogtwo.bark();
			}
		}
	}
}
