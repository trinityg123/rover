
/**
 * Write a description of class Rover_Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Rover_Runner
{
    
    public static void main(String args[]){
        // Make a Scanner
        Scanner user_input = new Scanner(System.in);
        
        System.out.println("What is your rover's name?");
        String name;
        name = user_input.next();
        System.out.println("Your rover is " + name + ".");
        
        boolean running = true;
        String exitCommand = "quit";
        
        while (running) {                
            Rover r1 = new Rover(name);
            System.out.println("Commands");
            System.out.println("move: To move a distance forward.");
            System.out.println("right: to turn right.");
            System.out.println("left: to turn left.");
            
            System.out.println("Enter a command:");
            String command = user_input.next();
            if(command.equals("move")){
                r1.move();
                System.out.println("Enter a distance to move:");
              
            }
            else if(command.equals("right")){
                r1.rotateRight();
            }
            else if(command.equals("left")){
                r1.rotateLeft();
            }
            else{
                System.out.print("Invalid Command");
            }
        }
    }
}
