/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;

class starter{
    public static void main(String args[]) {
        Potato fry = new Potato();
        Potato sp = new Potato("green","baked",100);
        System.out.println(fry.eatable());
        System.out.print(sp.eatable());
	}
}