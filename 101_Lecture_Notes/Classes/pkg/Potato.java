/* 
    Lecture note example - Classes
*/
package pkg;

public class Potato{
    
    // Global Variables
    
    String color;
    boolean isEdible;
    String type;
    double mass;
    
    // Constructors
    
    public Potato(){
        color = "Brown";
        isEdible = true;
        type = "French Fries";
        mass = 170.5;
    }
    
    public Potato(String c, String t, double m){
        color = c;
        isEdible = false;
        type = t;
        mass = m;
    }
    
    // Methods
    
    public boolean eatable(){
        return isEdible;
    }
}