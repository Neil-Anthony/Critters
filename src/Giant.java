import java.awt.*;

public class Giant extends Critter {
    private int moves=1;

    public Giant() {

    }

    public String toString() {
        if (moves > 24){
            moves = 1;
        }
        if (moves <= 6 && moves >= 1){
            return "Fee";
        }
        if (moves >=7 && moves <= 12){
            return "Fie";
        }if (moves >=13 && moves <= 18) {
            return "Foe";
        } else return "Fum";

    }


    public Action getMove(CritterInfo info){
        //always infect if an enemy is in front, otherwise hop if possible, otherwise turn right.
        moves++;
        if(info.getFront()==Neighbor.OTHER){
            return Action.INFECT;
        } else if (info.getFront()==Neighbor.EMPTY){
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }

    public Color getColor() {
        return Color.GRAY;
    }
}
