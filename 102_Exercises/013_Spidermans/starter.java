/*
	Author: Lucas Czachor
	Date: 29/10/24
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman test = new Spiderman("john", 983, "evil man");
		test.getAge();
		System.out.println("The villain is "+test.getVillain());
		test.fight();
		test.printArt();
	}
}
