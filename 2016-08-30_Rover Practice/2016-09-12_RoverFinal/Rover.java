
/**
 * Write a description of class Rover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rover
{
    // fields
    String name;
    int x;
    int y;
    int dir;// 0=North, 1=East, 2=South, 3=West
    int distance;
    
    public Rover(String name)
    {
        this.name = name;
        this.x = 0;
        this.y = 0;
        this.dir = 0;
    }
    
    public void move()
    {
        if (dir == 0)
        {
            y += 1;
            System.out.println(name + " is facing North.");
        }
        else if (dir == 1)
        {
            x += 1;
            System.out.println(name + " is facing North East.");
        }
        else if (dir == 2)
        {
            y -= 1;
            System.out.println(name + " is facing East.");
        }
        else if (dir == 3)
        {
            x -= 1;
            System.out.println(name + " is facing South East.");
        }
        else if (dir == 4)
        {
            x -= 1;
            System.out.println(name + " is facing South.");
        }
        else if (dir == -3)
        {
            x -= 1;
            System.out.println(name + " is facing South West.");
        }
        else if (dir == -2)
        {
            x -= 1;
            System.out.println(name + " is facing West.");
        }
        else if (dir == -1)
        {
            x -= 1;
            System.out.println(name + " is facing North West.");
        }
                
        System.out.println(name + " moved in direction " + dir);
    }
    
    public void rotateLeft() 
    {
        dir -= 1;
        
        if (dir < -3)
        {
            dir = 4;
        }
        
        System.out.println(name + " turned to the left");        
    }
    
    public void rotateRight()
    {
        dir += 1;
        
        if (dir == 5)
        {
            dir = -3;
        }
        
        System.out.println(name + " turned to the right");        
    }
}
