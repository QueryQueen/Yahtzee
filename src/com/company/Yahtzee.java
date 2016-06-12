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

    //constructor for class Yahtzee
    //we fill the dice array with 5 instances of die
    Yahtzee() {
        for (int i = 0; i < 5; i++) {
            dice[i] = new Die();
        }
    }

    //First we need some interested players
    //object player is constructed with a String name
    Player player1 = new Player();
    Player player2 = new Player();
    Player player3 = new Player();

    Player[] players = {player1, player2, player3};

    //We also need to use a scoresheet to calculate the scores
    Scoresheet myScoresheet = new Scoresheet();

    //Finally we need to keep track of the number of rounds, max 7 rounds per game of Yahtzee
    int rounds = 0;

    //We need a scanner to get userInput
    Scanner sc = new Scanner(System.in);

    //We need a method to play the game Yahtzee
    void playYahtzee() {

        //the game consists of multiple turns which results in a turnscore
        //in each turn you are allowed to roll the dice three times
        while (rounds < 2) {
            for(Player player : players)
            doTurn(player);
            rounds++;
            System.out.println("We have played " + rounds + " rounds");
        }
        getWinner(players);
        System.out.println("The game has ended");
        isOngoing = false;
    }

    private void doTurn(Player player) {

        System.out.println(player.name + " is rolling the dice");
        player.score = myScoresheet.getTurnResult(dice);
        System.out.println("Your score is: " + player.score);

        player.turnScores.add(player.score);
        System.out.println("So far you have scored" + player.turnScores);

        player.totalScore = player.getTotalScore(player.turnScores);
        System.out.println("Your total score so far " + player.totalScore);
    }

}
