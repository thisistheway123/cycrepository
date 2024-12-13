/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		PooleDwarf dwarf1 = new PooleDwarf(randName(), 6);
		PooleDwarf dwarf2 = new PooleDwarf(randName(), 3);
		PooleDwarf dwarf3 = new PooleDwarf(randName(), 12);
		PooleDwarf dwarf4 = new PooleDwarf(randName(), 99);
		PooleDwarf dwarf5 = new PooleDwarf(randName(), 62);
		PooleDwarf dwarf6 = new PooleDwarf(randName(), 78);
		PooleDwarf dwarf7 = new PooleDwarf(randName(), 34);
		String dwarf1name = dwarf1.getName();
		int count = 0;
		if(dwarf1.isSameName(dwarf2.getName()))
			count++;
		if(dwarf1.isSameName(dwarf3.getName()))
			count++;
		if(dwarf1.isSameName(dwarf4.getName()))
			count++;
		if(dwarf1.isSameName(dwarf5.getName()))
			count++;
		if(dwarf1.isSameName(dwarf6.getName()))
			count++;
		if(dwarf1.isSameName(dwarf7.getName()))
			count++;
		System.out.println(dwarf1name+" "+count+" duplicates.");
	}
}
