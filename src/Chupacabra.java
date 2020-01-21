import java.awt.*;

public class Chupacabra extends Critter {

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront()==Neighbor.SAME){
            if (info.getDirection()==Direction.NORTH){
                    return Action.LEFT;
            }
            if (info.getDirection()==Direction.SOUTH){
                return Action.RIGHT;
            }
            if (info.getDirection()==Direction.EAST){
                return Action.RIGHT;
            }
        }
    }

    public Color getColor() {
        return Color.BLACK;
    }

    public String toString() {
        return "C";
    }
}

