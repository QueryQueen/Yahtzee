package com.company;
import java.util.Scanner;

/**
 * Created by Joedid on 10/06/16.
 */
public class Game {
    boolean isOngoing = true;
    Player player;

    String askName(){
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
    }
    //TODO optioneel: maak een quitGame methode om ten alle tijden het spel te stoppen
    //TODO maak getWinner methode (highest total score = winnaar)
}
