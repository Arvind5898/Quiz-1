/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author debia7331
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Creating a city. 
        City kw = new City();

        // Creating a robot. 
        RobotSE bob = new RobotSE(kw, 4, 0, Direction.EAST);

        // Creating new things.
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 1, 4);
        new Thing(kw, 2, 3);

        // Creating walls 
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.EAST);

        // Commanding bob to climb, collect and place lights on the other side.
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.turnRight();
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.turnRight();
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.turnRight();
        bob.move();
        bob.pickThing();
        bob.move();
        bob.putThing();
        bob.move();
        bob.turnRight();
        bob.move();
        bob.putThing();
        bob.turnLeft();
        bob.move();
        bob.turnRight();
        bob.move();
        bob.putThing();
        bob.turnLeft();
        bob.move();
        bob.turnRight();
        bob.move();
        bob.putThing();
        bob.turnLeft();
        bob.move();





    }
}
