package com.company;
import java.util.Scanner;

/**
 * Created by Joedid on 10/06/16.
 */

public class Main {

    public static void main(String[] args) {

        //First we have to initiate a new game of Yahtzee
        //In the constructor 5 dice and 3 players are initialised and stored in an array
        Yahtzee myYahtzee = new Yahtzee();

        //We would like to know their names
        for (Player player : myYahtzee.players) {
            player.name = player.askName();
        }
        //And welcome them to the game
        System.out.println("Welcome to the game " + myYahtzee.players[0].name + ", " + myYahtzee.players[1].name + " & " + myYahtzee.players[2].name);

        //We will play Yahtzee!
        while (myYahtzee.isOngoing = true) {
            myYahtzee.playYahtzee();
        }
        myYahtzee.getWinner(myYahtzee.players);
        System.out.println("The game has ended");
    }

}
