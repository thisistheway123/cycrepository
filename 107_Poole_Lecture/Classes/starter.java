/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;

class starter{
    public static void main(String args[]) {
       Cow bob = new Cow();
       Cow betsy = new Cow(192, "Orange", true);
       System.out.println(bob.getFlavor());
       System.out.println(betsy.getFlavor());
       bob.moo();
       betsy.moo();
       
       
       Car mobile = new Car();
       Car batmobile = new Car("Lambo", 525, "Black");
       batmobile.paint("Pink");
       mobile.vroom();
       batmobile.vroom();
       
	}
}