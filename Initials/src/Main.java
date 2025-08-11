import kareltherobot.*;

public class Main implements Directions {
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setDelay(2);

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(2,1,North,22);
    Robot y = new Robot(2,6,North,22);
		
    for (int x=1; x<=3; x++){
        r.putBeeper();
        r.move();
        y.putBeeper();
        y.move();
    }

    for (int x=1; x<=3; x++){
      r.turnLeft();
      y.turnLeft();
    }

    r.move();
    y.move();

    for (int x=1; x<=2; x++){
      r.putBeeper();
      r.move();
      y.putBeeper();
      y.move();
    }

    for (int x=1; x<=3; x++){
      r.turnLeft();
      y.turnLeft();
    }

    r.move();
    y.move();

    for (int x=1; x<=1; x++){
      r.putBeeper();
      r.move();
      y.putBeeper();
      y.move();
    }

    for (int x=1; x<=3; x++){
      r.turnLeft();
      y.turnLeft();
    }

    r.putBeeper();
    r.move();
    y.putBeeper();
    y.move();

    for (int x=1; x<=2; x++){
      r.putBeeper();
      r.move();
      y.putBeeper();
      y.move();
    }

    for (int x=1; x<=2; x++){
      r.turnLeft();
      y.turnLeft();
    }

    for (int x=1; x<=3; x++){
      r.move();
      y.move();
    }

    for (int x=1; x<=3; x++){
      r.turnLeft();
      y.turnLeft();
    }

    r.move();
    y.move();
    r.putBeeper();
    y.putBeeper();
    r.turnLeft();
    y.turnLeft();
    r.move();
    y.move();
    r.putBeeper();
    y.putBeeper();
  }
}