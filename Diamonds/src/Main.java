import kareltherobot.*;

public class Main implements Directions {
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setSize(19, 19);
    World.setDelay(2);


    //Eneter the side length!! (max 9)
    //side length is a line between 2 dots so sidelength is 1 less than the number of beepers per side
    int sidelength = 3;
    Robot r = new Robot(2,9,North,sidelength*5);

    //Creates first side
    for (int x=1; x<=sidelength-1; x++){
      r.putBeeper();
      r.turnLeft();
      r.move();
      for (int i=1; i<=3; i++){
        r.turnLeft();
      }
      r.move();
    }
    r.putBeeper();
    r.move();
    for (int i=1; i<=3; i++){
      r.turnLeft();
    }
    r.move();


    //Creates the next 3 sides
    for (int i=1;i<=3;i++){
      for (int x=1; x<=sidelength-1; x++){
        r.putBeeper();
        r.turnLeft();
        r.move();
      for (int c=1; c<=3; c++){
        r.turnLeft();
      }
      r.move();
      }
      r.putBeeper();
      r.move();
      for (int b=1; b<=3; b++){
        r.turnLeft();
      }
    r .move();
    }
    r.move();
  }
}