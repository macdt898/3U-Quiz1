
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macdt8987
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea a new city
        City qwe = new City();
        // Make a robot\
        RobotSE karl = new RobotSE(qwe,4,0,Direction.EAST);
        // Create the walls
        new Wall(qwe,4,2,Direction.NORTH);
        new Wall(qwe,4,2,Direction.WEST);
        new Wall(qwe,3,3,Direction.NORTH);
        new Wall(qwe,3,3,Direction.WEST);
        new Wall(qwe,2,4,Direction.WEST);
        new Wall(qwe,2,4,Direction.NORTH);
        new Wall(qwe,2,5,Direction.NORTH);
        new Wall(qwe,2,5,Direction.EAST);
        new Wall(qwe,3,6,Direction.EAST);
        new Wall(qwe,3,6,Direction.NORTH);
        new Wall(qwe,4,7,Direction.NORTH);
        new Wall(qwe,4,7,Direction.EAST);
        // Make the things\
        new Thing(qwe,3,2);
        new Thing(qwe,2,3);
        new Thing(qwe,4,1);
        new Thing(qwe,1,4);
        // Move the robot up the stairs picking things
        karl.move();
        karl.turnLeft();
        karl.pickThing();
        karl.move();
        karl.turnRight();
        karl.move();
        karl.pickThing();
        karl.turnLeft();
        karl.move();
        karl.turnRight();
        karl.move();
        karl.pickThing();
        karl.turnLeft();
        karl.move();
        karl.turnRight();
        karl.move();
        karl.pickThing();
        karl.move();
        karl.putThing();
        karl.move();
        karl.turnRight();
        karl.move();
        karl.putThing();
        karl.turnLeft();
        karl.move();
        karl.turnRight();
        karl.move();
        karl.putThing();
        karl.turnLeft();
        karl.move();
        karl.turnRight();
        karl.move();
        karl.turnLeft();
        karl.putThing();
        karl.move();
        
        
    }
}
