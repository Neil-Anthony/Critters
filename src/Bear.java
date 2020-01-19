import com.sun.org.apache.xpath.internal.operations.Bool;

import java.awt.*;
import java.util.Random;

public class Bear extends Critter {
    private Random rd = new Random();
    private boolean polar = rd.nextBoolean();
    private int moves;

    public Bear (Boolean polar) {

    }

    public Color getColor() {

        if (polar){
            return Color.BLACK;
        }else{
            return Color.WHITE;
        }
    }


    public String toString(){
        //Should alternate on each different move between a slash character (/)
        // and a backslash character () starting with a slash.
        if (moves%2==0){
            return "/";
        } else {
            return "\\";
        }

    }

    public Action getMove(CritterInfo info){
        //always infect if an enemy is in front, otherwise hop if possible, otherwise turn left.
        moves++;
        if(info.getFront()==Neighbor.OTHER){
            return Action.INFECT;
        } else if (info.getFront()==Neighbor.EMPTY){
            return Action.HOP;
        } else {
            return super.getMove(info);
        }
    }

}