/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You find yourself lost in this maze, heart racing as you hear Diddy’s chilling laughter behind you. With no time to waste, you must navigate your way to safety.");
        System.out.println("As you run through the maze, you reach a fork in the path. Diddy’s laughter grows louder, and you know you must decide quickly.");
        System.out.println("Do you:");
        System.out.println("Option A: Take the left path, which is dark and narrow but seems to lead deeper into the maze");
        System.out.println("Option B: Take the right path, which is lit and wide, but you hear faint whispers that make you uneasy");
        System.out.println("Option C: Head straight ahead, where you can see a flickering light in the distance, possibly leading to an exit");
        char firstOption = sc.next().charAt(0);
        if(firstOption == 'A'){
            System.out.println("You sprint down the left path. It’s tight, but you manage to squeeze through. Suddenly, you find a hidden alcove where you can hide for a moment, but you hear Diddy’s footsteps approaching rapidly. You’ll need to wait until he passes before moving again.");
            System.out.println("As you wait, you hear Diddy muttering to himself, his voice low and menacing. You notice a glint on the floor—it’s a small object that might help you, but reaching for it could give away your hiding spot.");
            System.out.println("Do you:");
            System.out.println("Option A: Grab the object quietly, hoping it might be useful against Diddy");
            System.out.println("Option B: Stay perfectly still and listen to Diddy, trying to gather information about his intentions");
            System.out.println("Option C: Make a sudden move, hoping to startle Diddy and make a break for it");
            char secondOption = sc.next().charAt(0);
            if(secondOption == 'A'){
                System.out.println("You slowly reach for the object, revealing a small knife. As Diddy gets closer, you feel a rush of courage. You now have a means of defense. Just as he nears the alcove, you prepare to confront him.");
            }
            else if(secondOption == 'B'){
                System.out.println("You stay still, straining to hear Diddy’s words. He reveals his twisted plan to trap anyone who enters the maze. Armed with this knowledge, you now have a better idea of how to escape when the time comes.");
            }
            else if(secondOption == 'C'){
                System.out.println("You suddenly leap from the alcove, startling Diddy. He momentarily hesitates, giving you a chance to sprint down the path. However, you realize you’ve lost track of the maze's layout, and you must act quickly to find your way out.");
            }
            else{
                System.out.println("While you were thinking of the correct decision, Diddy caught a glimpse of you in the alcove. You are dead.");
            }
        }
        else if(firstOption == 'B'){
            System.out.println("The right path feels safer, but the whispers grow louder, sounding eerily familiar. You reach a clearing where you find an old map of the maze. It might help you navigate, but it could also attract Diddy if he’s close.");
        }
        else if(firstOption == 'C'){
            System.out.println("You run straight toward the flickering light, adrenaline pumping. As you approach, you realize it’s a trap—a dead end with Diddy waiting. You must think fast to escape his clutches.");
        }
        else{
            System.out.println("You fumble when choosing and trip. You try to get back up but it was too late and you are mutilated by Diddy.");
        }
        
	}
}