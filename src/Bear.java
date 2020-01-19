import java.awt.*;
import java.util.Random;

public class Bear extends Critter {
    private Random rd = new Random();
    private boolean polar = rd.nextBoolean();
    private int turn = 0;

    public Bear (boolean polar) {

    }
    public Color getColor() {

        if (polar){
            return Color.BLACK;
        }else{
            return Color.WHITE;
        }
    }

    public String toString(){
        turn++;
        if (turn % 2 == 1){
            return "/";
        }else{
            return "\\";
        }

    }

}
