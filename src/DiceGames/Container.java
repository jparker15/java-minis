package DiceGames;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Container {
    private List<Die> dice = new ArrayList<>();

    public Container(int size){
        for(int count = 0; count < size; count++){
            dice.add(new Die());
        }
    }

    public void roll(Random rand){
        // for each die in dice
        for (var die: dice) {
            die.roll(rand);
        }
    }
    // single roll die
    public void roll (Random rand, int choice){}


    @Override
    public String toString(){
        String output = "";
        for (Die die:dice) {
            output += die.getValue() + "";
        }
        return output.trim();
    }
}
