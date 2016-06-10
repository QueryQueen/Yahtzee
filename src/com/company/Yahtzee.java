package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Joedid on 10/06/16.
 */
public class Yahtzee extends Game {

    //A game of Yahtzee is always played with 5 dices
    //They belong together als a collection of die
    //so we can make an array for 5 objects of Die
    Die[] dice = new Die[5];

    //First we need some interested players
    //object player is constructed with a String name
    //TODO: make it so that players can type their name, and this name is used to construct the player
    Player player1 = new Player();
    Player player2 = new Player();
    Player player3 = new Player();

    //constructor for class Yahtzee
    //we fill the dice array with 5 instances of die
    Yahtzee() {
        for (int i = 0; i < 5; i++) {
            dice[i] = new Die();
        }
    }

    //We also need to use a scoresheet
    Scoresheet myScoresheet = new Scoresheet();

    //Finally we need to keep track of the number of rounds, max 7 rounds per game of Yahtzee
    int rounds = 0;

    //We need a scanner to get userInput
    Scanner sc = new Scanner(System.in);

    //We need a method to play the game Yahtzee
    void playYahtzee(){

        //the game consists of multiple turns which results in a turnscore
        //in each turn you are allowed to roll the dice three times
        System.out.println(player1.name + " is rolling the dice");
        player1.score = myScoresheet.getTurnScore(dice);
        System.out.println("Your result is: " + Arrays.toString(player1.score));




    }

}
