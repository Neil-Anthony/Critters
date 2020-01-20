import java.awt.*;
import java.util.*;


public class Lion extends Critter {
    private int colorMoves;
    Color lionColor;
    Random rand = new Random();

    public Lion(){
        colorMoves=0;//1,2,3
        getColor();
    }

    public Color getColor() {
        //Randomly picks one of three colors (Color.RED, Color.GREEN, Color.BLUE) and uses that color for three moves,
        // then randomly picks one of those colors again for the next three moves,
        // then randomly picks another one of those colors for the next three moves, and so on.
        if (colorMoves%3==0){ // set new color
            int x=0;
            while (x==0){
                int i=rand.nextInt(3); //0.Red 1.Green 2.Black
                if (i==0 && this.lionColor!=Color.RED){
                    this.lionColor= Color.RED;
                    x++;
                } if (i==1 && lionColor!=Color.GREEN){
                    this.lionColor=Color.GREEN;
                    x++;
                } if (i==2 && lionColor!=Color.BLUE){
                    this.lionColor=Color.BLUE;
                    x++;
                }
            }

        }
        return lionColor;
    }

    public String toString() {
        return "L";
    }

    public Action getMove(CritterInfo info) {
        /*
        always infect if an enemy is in front,
         otherwise if a wall is in front or to the right, then turn left,
         otherwise if a fellow Lion is in front, then turn right, otherwise hop.
        */
        colorMoves++;
        if (info.getFront()==Neighbor.OTHER){
            return Action.INFECT;
        } else if (info.getFront()==Neighbor.WALL||info.getRight()==Neighbor.WALL){
            return Action.LEFT;
        } else if (info.getFront()==Neighbor.SAME){
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}
