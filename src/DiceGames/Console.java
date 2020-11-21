package DiceGames;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
   static Scanner scanner = new Scanner(System.in);

   static public void welcome(){
        System.out.println("YAHTZEE!!! \n ");
    }

   static public int getChoice(){
        System.out.println("pick a die 1 - 5 to re-roll");
        int choice = scanner.nextInt();
        return choice;
    }

    static public ArrayList<Integer> getChoices(){
       ArrayList<Integer> choices = new ArrayList<>();
       // TODO: get the choices
        System.out.println("Which dice do you want to re-roll?");
        String input = scanner.nextLine(); //"1 3 5"
        String[] inputArray = input.split(" "); // ["1", "3", "5"] -> <1,3,5>
        for (String number: inputArray){
            choices.add(Integer.parseInt(number) - 1);
        }

        return choices ;
    }
}
