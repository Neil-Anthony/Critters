import java.awt.*;
import java.util.Random;


public class Lion extends Critter {

    private int moves;
    private Random rand;
    private int colorNumber = rand.nextInt(3);

    public Lion() {

    }


    public String toString(){
        return "L";
    }



    public Action getMove(CritterInfo info){
        moves++;
        if (info.getFront()==Neighbor.OTHER){
            return Action.INFECT;
        }else if ((info.getFront()==Neighbor.WALL)||(info.getRight()==Neighbor.WALL)){
            return Action.LEFT;
        }else if (info.getFront()==Neighbor.SAME){
            return Action.RIGHT;
        }else{
            return Action.HOP;
        }
    }
}
