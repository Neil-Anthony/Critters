import java.awt.*;

public class gallopingGator extends Critter{

    public gallopingGator(){

    }

    public String toString(){
        return "‽";
    }

    public Action getMove(CritterInfo info){
        return super.getMove(info);
    }


    public Color getColor() {
        return Color.GREEN;
    }
}
