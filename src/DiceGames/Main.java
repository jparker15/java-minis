package DiceGames;

import java.util.Random;

public class Main {

    //TODO: Detect Yahtzee

    public static void main(String[] args){
        Die aDie = new Die();
        Random rand = new Random();
        Container cup = new Container(5);

//        aDie.roll(rand);
        Console.welcome();
        System.out.println(cup);
        cup.roll(rand, Console.getChoices());
        System.out.println(cup);
        cup.roll(rand,Console.getChoices());


    }


}
