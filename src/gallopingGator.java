import java.awt.*;

public class gallopingGator extends Critter{

    public gallopingGator(){

    }

    public String toString(){
        return "‽";
    }

    public Action getMove(CritterInfo info){
        if (info.getFront()== Neighbor.OTHER){
            return Action.INFECT;
        }
        if (info.getFront()==Neighbor.SAME && info.getRight()==Neighbor.SAME){
            return Action.LEFT;
        }

        if (info.getFront()==Neighbor.WALL && info.getRight()==Neighbor.WALL){
            return Action.LEFT;
        }
        if (info.getFront()==Neighbor.WALL && info.getDirection()==Direction.NORTH){
            return Action.RIGHT;
        }
        if (info.getFront()==Neighbor.WALL && info.getDirection()==Direction.EAST){
            return Action.LEFT;
        }
        if (info.getFront()==Neighbor.WALL && info.getDirection()==Direction.SOUTH){
            return Action.LEFT;
        }
        if (info.getFront()==Neighbor.WALL && info.getDirection()==Direction.WEST) {
            return Action.RIGHT;
        }

        if (info.getFront()==Neighbor.SAME && info.getLeft()==Neighbor.SAME){
            return Action.RIGHT;
        }
        if (info.getLeft()==Neighbor.SAME && info.getLeft()==Neighbor.SAME && info.getRight()==Neighbor.SAME){
            return Action.HOP;
        }
        return Action.HOP;
    }


    public Color getColor() {
        return Color.GREEN;
    }
}
