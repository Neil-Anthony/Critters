import java.awt.*;

public class Chupacabra extends Critter {

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront()==Neighbor.SAME){ // If it collides with another Chupacabra
            if (info.getDirection()==Direction.NORTH){
                    return Action.LEFT;
            }
            if (info.getDirection()==Direction.SOUTH){
                return Action.RIGHT;
            }
            if (info.getDirection()==Direction.EAST){
                return Action.LEFT;
            }//End if it collides with another Chupacabra
        }else if (info.getFront()==Neighbor.WALL){

            return Action.RIGHT;
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

