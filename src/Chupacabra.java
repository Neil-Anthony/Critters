import java.awt.*;
import java.util.*;
//Chupacabra seems to win about 60% of the time
//It wins about 80% of the time when no bears are involved.
public class Chupacabra extends Critter {
int moves=1;
Random rand = new Random();
    public Action getMove(CritterInfo info) {
        int r = rand.nextInt(2);
        //Infect if another species is in front
        if (info.getFront() == Neighbor.OTHER) {
        return Action.INFECT;
        }
        //If creature is against a wall
        if (info.getFront()==Neighbor.WALL) {
        //If it hits a corner it will turn the corner despite the direction
            if (info.getRight() == Neighbor.WALL) {
                return Action.LEFT;
            }
            if (info.getLeft() == Neighbor.WALL) {
                return Action.RIGHT;
            }
            //Turn in a random direction when a wall is in front and no creatures on sides
            if (info.getLeft()==Neighbor.EMPTY){
                if (info.getRight()==Neighbor.EMPTY){
                    if (r == 0){
                        return Action.LEFT;
                    }
                    if (r == 1){
                        return Action.RIGHT;
                    }
                }
            }
            //Prevents creature from getting stuck in on walls
            if (info.getRight()==Neighbor.SAME){
                return Action.LEFT;
            }
            if (info.getLeft()==Neighbor.SAME){
                return Action.RIGHT;
            }
        }
        //Prevents creature from getting stuck against another creature
        if (info.getFront()==Neighbor.SAME){
            if(r==1) {
                return Action.LEFT;
            }
            if(r==0){
                return Action.RIGHT;
            }
        }

    return Action.HOP;
    }

    public Color getColor() {
        return Color.magenta;
    }

    public String toString() {
        return "C";
    }
}

